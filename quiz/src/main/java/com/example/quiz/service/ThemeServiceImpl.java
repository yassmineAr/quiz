package com.example.quiz.service;

import com.example.quiz.model.Theme;
import com.example.quiz.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class ThemeServiceImpl implements ThemeService {
        @Autowired
        ThemeRepository themeRepository;

        @Override
        public Theme saveTheme(Theme theme) {
            return themeRepository.save(theme);
        }

        @Override
        public Theme updateTheme(Theme theme) {
            return themeRepository.saveAndFlush(theme);
        }

        @Override
        public List<Theme> getAllThemeList() {
            return themeRepository.findAll();
        }

        @Override
        public void deleteTheme(long idTheme) {
            themeRepository.deleteById(idTheme);

        }

        @Override
        public Optional<Theme> findTheme(Theme theme) {
            return themeRepository.findById(theme.getIdTheme());
        }

        @Override
        public Optional<Theme> findThemeById(long idTheme) {
            return themeRepository.findById(idTheme);
        }
    }















