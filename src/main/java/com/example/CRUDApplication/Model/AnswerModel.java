package com.example.CRUDApplication.Model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "Answer", schema = "dbo", catalog = "Site")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class AnswerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AnswerId", nullable = false)
    private Long AnswerId;

    @Column(name = "AnswerUserId")
    private int AnswerUserId;

    @Column(name = "AnswerQuesId")
    private int AnswerQuesId;

    @Column(name = "AnswerText")
    private String AnswerText;

    @Column(name = "AnswerDate")
    private String AnswerDate;

    @Column(name = "AnswerShift")
    private int AnswerShift;

    @Column(name = "AnswerComment")
    private String AnswerComment;

    @Column(name = "AnswerWorkPlaceName")
    private String AnswerWorkPlaceName;

    @Column(name = "AnswerDateTime")
    private String AnswerDateTime;

    @Column(name = "AnswerPhotos")
    private String AnswerPhotos;

    @Column(name = "AnswerReview")
    private String AnswerReview;

//    @Column(name = "AnswerCheckMaster")
//    private int AnswerCheckMaster;
//
//    @Column(name = "AnswerCheckManager")
//    private int AnswerCheckManager;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AnswerModel that = (AnswerModel) o;
        return AnswerId != null && Objects.equals(AnswerId, that.AnswerId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
