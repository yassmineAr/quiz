package com.example.quiz.service;

import com.example.quiz.model.Theme;
import java.util.List;
import java.util.Optional;

    public interface ThemeService {
        Theme saveTheme(Theme theme);
        Theme updateTheme(Theme theme);
        List<Theme> getAllThemeList();
        void deleteTheme(long idTheme);
        Optional<Theme> findTheme(Theme theme);

        Optional<Theme> findThemeById(long idTheme);

    }

