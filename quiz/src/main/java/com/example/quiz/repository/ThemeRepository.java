package com.example.quiz.repository;
import com.example.quiz.model.Theme;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
@Repository
public interface ThemeRepository extends JpaRepository<Theme,Long> {
        Optional<Theme> findThemeByName(String name);
    }
