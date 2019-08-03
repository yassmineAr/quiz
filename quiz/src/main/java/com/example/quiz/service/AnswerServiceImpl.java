package com.example.quiz.service;

import com.example.quiz.DTO.AnswerDTO;
import com.example.quiz.model.Answer;
import com.example.quiz.model.Question;
import com.example.quiz.model.Theme;
import com.example.quiz.repository.AnswerRepository;
import com.example.quiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerRepository answerRepository;
    @Autowired
    QuestionRepository questionRepository;



    @Override
    public Answer saveAnswer(AnswerDTO answerDTO) {
        Answer a = new Answer();
        Question question = questionRepository.findQuestionByNum(answerDTO.getNum()).get();
        if (question==null) throw new RuntimeException("question n'existe pas");
        a.setDescreption(answerDTO.getDescription());
        a.setQuestion(question);

        return answerRepository.save(a);
    }

    @Override
    public Answer updateAnswer(Answer answer) {
        return answerRepository.saveAndFlush(answer);
    }

    @Override
    public List<Answer> getAllAnswerList() {

        return answerRepository.findAll();
    }

    @Override
    public void deleteAnswer(long idA) {
        answerRepository.deleteById(idA);

    }

    @Override
    public Optional<Answer> findAnswer(Answer answer) {
        return answerRepository.findById(answer.getIdA());
    }

    @Override
    public Optional<Answer> findAnswerById(long idA) {

        return answerRepository.findById(idA);
    }
}



