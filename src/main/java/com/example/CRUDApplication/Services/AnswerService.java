package com.example.CRUDApplication.Services;

import com.example.CRUDApplication.Model.AnswerModel;
import com.example.CRUDApplication.Repository.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class AnswerService {

    @PersistenceContext
    private EntityManager entityManager;

    private final AnswerRepo answerRepository;

    @Autowired
    public AnswerService(AnswerRepo answerRepository) {
        this.answerRepository = answerRepository;
    }

    public List<AnswerModel> findAll(){
        return answerRepository.findAll();
    }

    public AnswerModel getUserById(long id){
        return answerRepository.getOne(id);
    }

    public AnswerModel saveUser(AnswerModel answerModel){
        return answerRepository.save(answerModel);
    }

    public void deleteUserById(long id){
        answerRepository.deleteById(id);
    }
}
