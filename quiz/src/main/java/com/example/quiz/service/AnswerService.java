package com.example.quiz.service;


import com.example.quiz.DTO.AnswerDTO;
import com.example.quiz.model.Answer;

import java.util.List;
import java.util.Optional;

public interface AnswerService {
    Answer saveAnswer(AnswerDTO answer);
    Answer updateAnswer(Answer answer);
    List<Answer> getAllAnswerList();
    void deleteAnswer(long idA);
    Optional<Answer> findAnswer(Answer answer);
    Optional<Answer> findAnswerById(long idA);
}


