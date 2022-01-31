package com.example.CRUDApplication.Repository;

import com.example.CRUDApplication.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, Long> {
}
