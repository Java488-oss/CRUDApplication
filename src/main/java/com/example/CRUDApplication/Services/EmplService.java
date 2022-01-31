package com.example.CRUDApplication.Services;

import com.example.CRUDApplication.Model.EmployListModel;
import com.example.CRUDApplication.Repository.EmplRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplService {


    private final EmplRepo employRepository;

    @Autowired
    private EmplService(EmplRepo employRepository) {
        this.employRepository = employRepository;
    }

    public List<EmployListModel> findAll(){
        return employRepository.findAll();
    }

    public EmployListModel getUserById(long id){
        return employRepository.getOne(id);
    }

    public EmployListModel saveUser(EmployListModel employListModel){
        return employRepository.save(employListModel);
    }

    public void deleteUserById(long id){
        employRepository.deleteById(id);
    }

}
