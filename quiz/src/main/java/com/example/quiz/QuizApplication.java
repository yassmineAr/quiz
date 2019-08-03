package com.example.quiz;

import com.example.quiz.model.Question;
import com.example.quiz.model.Theme;
import com.example.quiz.repository.QuestionRepository;
import com.example.quiz.repository.ThemeRepository;
import com.example.quiz.service.QuestionService;
import com.example.quiz.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class QuizApplication implements CommandLineRunner {
@Autowired
	ThemeRepository themeRepository;
@Autowired
	QuestionRepository questionRepository;
@Autowired
	ThemeService themeService;
@Autowired
	QuestionService questionService;

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);

	}
	@Override
	public void run(String... args)throws Exception {
		Theme t1 = new Theme();
		t1.setName("JavaEE");
		Theme t2 = new Theme();
		t2.setName("Java");
		themeRepository.save(t1);
		themeRepository.save(t2);
		Question q1 = new Question();
		q1.setLibelle("definir java EE");
		q1.setTheme(t1);
		q1.setNum(1);
		Question q2 = new Question();
		q2.setLibelle("definir java ");
		q2.setTheme(t2);
		q2.setNum(2);
		questionRepository.save(q1);
		questionRepository.save(q2);

	}

}
