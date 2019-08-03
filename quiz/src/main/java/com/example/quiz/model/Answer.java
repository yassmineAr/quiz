package com.example.quiz.model;

import lombok.*;


import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idA ;
    private int libelle;
    private boolean descreption ;
    @ManyToOne
    @JoinColumn
    private Question question;


}
