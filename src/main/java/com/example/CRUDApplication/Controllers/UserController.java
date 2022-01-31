package com.example.CRUDApplication.Controllers;

import com.example.CRUDApplication.Model.UserModel;
import com.example.CRUDApplication.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String getAll(Model model){
        List<UserModel> userModelList = userService.findAll();

        model.addAttribute("userList", userModelList);
        return "index";
    }

    @GetMapping("/addUsers")
    public String getsave(UserModel userModel){
        return "addUser";
    }


    @PostMapping("/addUser")
    public String save(@Valid UserModel userModel, BindingResult result, Model model){

        if (result.hasErrors()) {
            return "addUser";
        }

        userService.saveUser(userModel);

        return "redirect:/";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String daleteUser(@PathVariable long id, Model model){
//        UserModel userModel = userService.getUserById(id);
        userService.deleteUserById(id);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showUserUpdate(@PathVariable("id") long id, Model model){
        UserModel userModelList = userService.getUserById(id);

        model.addAttribute("userList", userModelList);
        return "update";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateUser(@PathVariable long id, @Valid UserModel userModel, BindingResult result, Model model) {
        if (result.hasErrors()) {
            userModel.setId(id);
            return "update";
        }

        userService.saveUser(userModel);
        return "redirect:/";
    }

}
