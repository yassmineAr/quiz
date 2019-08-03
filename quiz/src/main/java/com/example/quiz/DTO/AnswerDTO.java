package com.example.quiz.DTO;


import com.example.quiz.model.Question;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AnswerDTO {




        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long idA ;
        private boolean descreption ;
        private Question question;
        private int num;


        public boolean getDescription() {
                return descreption;
        }
}

