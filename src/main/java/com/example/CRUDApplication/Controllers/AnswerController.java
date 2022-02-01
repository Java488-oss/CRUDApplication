//package com.example.CRUDApplication.Controllers;
//
//import com.example.CRUDApplication.Model.AnswerModel;
//import com.example.CRUDApplication.Model.EmployListModel;
//import com.example.CRUDApplication.Services.AnswerService;
//import com.example.CRUDApplication.Services.EmplService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Controller
//public class AnswerController {
//
//    private final AnswerService answerService;
//    private final EmplService emplService;
//
//    @Autowired
//    public AnswerController(AnswerService answerService, EmplService emplService) {
//        this.answerService = answerService;
//        this.emplService = emplService;
//    }
//
//    private List addAllAttributes = new ArrayList();
//    private Set<String> userNameList = new HashSet<>();
//
////    @GetMapping("/")
////    public String getAll(Model model){
////
////        List<AnswerModel> answerModelList = answerService.findAll();
////        List<EmployListModel> employListModelList = emplService.findAll();
////        answerModelList.forEach(answerModel -> {
////            employListModelList.forEach(employListModel -> {
////                if(answerModel.getAnswerUserId()==employListModel.getEmplId()&&answerModel.getAnswerDate().equals("19.01.2022")&&answerModel.getAnswerShift()==2){
////                    userNameList.add(employListModel.getEmplSurname()+" "+employListModel.getEmplName()+" "+employListModel.getEmplSname());
////                    addAllAttributes.add(answerModel);
////
////                    model.addAttribute("date", answerModel.getAnswerDate());
////                    model.addAttribute("quesion", answerModel.getAnswerQuesId());
////                }
////            });
////
////        });
////        model.addAttribute("numbers",userNameList.size());
////        model.addAttribute("userName", userNameList);
////        model.addAttribute("test", addAllAttributes);
////        return "index";
////    }
//}
