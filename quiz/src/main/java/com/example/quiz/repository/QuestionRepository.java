package com.example.quiz.repository;

import com.example.quiz.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository("QuestionRepository")
public interface QuestionRepository extends JpaRepository<Question, Long> {
    Optional<Question> findQuestionByNum(int num);
}
