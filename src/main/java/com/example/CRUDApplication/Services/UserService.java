package com.example.CRUDApplication.Services;

import com.example.CRUDApplication.Model.UserModel;
import com.example.CRUDApplication.Repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<UserModel> findAll(){
        return userRepo.findAll();
    }

    public UserModel getUserById(long id){
        return userRepo.getOne(id);
    }

    public UserModel saveUser(UserModel userModel){
        return userRepo.save(userModel);
    }

    public void deleteUserById(long id){
        userRepo.deleteById(id);
    }

}
