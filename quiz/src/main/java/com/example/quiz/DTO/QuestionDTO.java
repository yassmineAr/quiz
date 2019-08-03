
package com.example.quiz.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor




public class QuestionDTO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idQuestion ;

    private String libelle ;

    private int num;
    private String theme;

}
