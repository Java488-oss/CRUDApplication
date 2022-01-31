package com.example.CRUDApplication.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeList", catalog = "Site", schema = "dbo")
@Data
public class EmployListModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EmplId", nullable = false)
    private Long EmplId;

    @Column(name = "EmplSurname")
    private String EmplSurname;

    @Column(name = "EmplName")
    private String EmplName;

    @Column(name = "EmplSname")
    private String EmplSname;

    @Column(name = "EmplTabnum")
    private int EmplTabnum;

    @Column(name = "EmplIsDeleted")
    private boolean EmplIsDeleted;

    @Column(name = "EmplIsMobile")
    private boolean EmplIsMobile;

    @Column(name = "EmplIsKey")
    private boolean EmplIsKey;
}