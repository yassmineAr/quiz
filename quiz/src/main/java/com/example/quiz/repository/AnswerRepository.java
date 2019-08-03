package com.example.quiz.repository;

import com.example.quiz.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("AnswerRepository")
public interface AnswerRepository extends JpaRepository<Answer, Long> {


}