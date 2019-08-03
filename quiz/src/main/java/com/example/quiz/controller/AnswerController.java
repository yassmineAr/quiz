package com.example.quiz.controller;


import com.example.quiz.DTO.AnswerDTO;
import com.example.quiz.model.Answer;
import com.example.quiz.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AnswerController {
    @Autowired
    AnswerService answerservice;

    @RequestMapping(method = RequestMethod.POST, value = "/saveAnswer")
    public Answer saveAnswer(@RequestBody AnswerDTO answerDTO) {

        return answerservice.saveAnswer(answerDTO);
    }

    @GetMapping("/allanswer")
    public List<Answer> getAllAnswer() {

        return answerservice.getAllAnswerList();
    }
    @RequestMapping("/{idA}")
    public Optional<Answer> findById(@PathVariable long idA){

        return answerservice.findAnswerById(idA);
    }

   /* @RequestMapping(method = RequestMethod.PUT, value = "/updateanswer")
    public void updateanswer(@RequestBody Answer answer) {
        answerservice.updateAnswer(answer);

    }*/

    @RequestMapping(method = RequestMethod.DELETE, value = "/{idA}")
    public void deleteanswer(@PathVariable long idA) {

        answerservice.deleteAnswer(idA);
    }
}