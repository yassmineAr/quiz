package com.example.quiz.service;

import com.example.quiz.DTO.QuestionDTO;
import com.example.quiz.model.Question;
import com.example.quiz.model.Theme;
import com.example.quiz.repository.QuestionRepository;
import com.example.quiz.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("QuestionService")
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepository questionRepository ;
    @Autowired
    ThemeRepository themeRepository;
    @Override
    public Question saveQuestion(QuestionDTO questionDto) {
        Question q = new Question();
        Theme theme = themeRepository.findThemeByName(questionDto.getTheme()).get();
        if (theme==null) throw new RuntimeException("theme n'existe pas");
        q.setLibelle(questionDto.getLibelle());
        q.setTheme(theme);

        return questionRepository.save(q);
    }

    @Override
    public Question updateQuestion(Question question) {
        return questionRepository.saveAndFlush(question);
    }

    @Override
    public List<Question> getAllQuestionList() {
        return questionRepository.findAll();
    }

    @Override
    public void deleteQuestion(long idQuestion) {
        questionRepository.deleteById(idQuestion);

    }

    @Override
    public Optional<Question> findQuestion(Question question) {
        return questionRepository.findById(question.getIdQuestion());
    }

    @Override
    public Optional<Question> findQuestionById(long idQuestion) {
        return questionRepository.findById(idQuestion);
    }


}



