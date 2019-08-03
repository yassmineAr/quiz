package com.example.quiz.controller;
import com.example.quiz.DTO.QuestionDTO;
import com.example.quiz.model.Question;
import com.example.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController

public class QuestionController {


    @Autowired
    private QuestionService questionservice;


    @RequestMapping(method = RequestMethod.POST, value = "/savequestion")
    public Question savequestion(@RequestBody QuestionDTO question) {

        return questionservice.saveQuestion(question);
    }

    @GetMapping("/allquestion")
    public List<Question> getAllQuestion() {

        return questionservice.getAllQuestionList();
    }

    @RequestMapping("/{idQuestion}")
    public Optional<Question> findById(@PathVariable long idQuestion) {

        return questionservice.findQuestionById(idQuestion);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/{idQuestion}")
    public void deletequestion(@PathVariable long idQuestion) {

        questionservice.deleteQuestion(idQuestion);
    }
    }







