package com.example.quiz.model;

import lombok.*;
import javax.persistence.*;



    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity

    public class Theme {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) //lehna id yetzed automatiquement .. yaani men 8ir metab3thou fi request post
        private long idTheme ;
        private String name;
    }




