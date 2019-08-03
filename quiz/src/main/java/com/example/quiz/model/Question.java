package com.example.quiz.model;

import lombok.*;
import javax.persistence.*;
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @Entity

        public class Question {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private long idQuestion ;

            private String libelle ;

            private int num;

            @ManyToOne
            @JoinColumn
            private Theme theme;



        }
