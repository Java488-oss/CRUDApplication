package com.example.CRUDApplication.Model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "[User]",schema = "dbo",catalog = "Test")
@Entity
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "[user]")
    private String user;

    @Column(name = "pass")
    private String pass;

}
