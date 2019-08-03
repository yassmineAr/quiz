package com.example.quiz.service;


import com.example.quiz.DTO.QuestionDTO;
import com.example.quiz.model.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    Question saveQuestion(QuestionDTO question);

    Question updateQuestion(Question question);

    List<Question> getAllQuestionList();

    void deleteQuestion(long idQ);

    Optional<Question> findQuestion(Question question);

    Optional<Question> findQuestionById(long idQuestion);


}

