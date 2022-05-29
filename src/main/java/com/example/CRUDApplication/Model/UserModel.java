package com.example.CRUDApplication.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "[User]",catalog = "Mobile")
@Entity
@Getter
@Setter
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "[user]")
    private String user;

    @Column(name = "pass")
    private String pass;

}
