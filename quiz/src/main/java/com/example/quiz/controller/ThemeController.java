package com.example.quiz.controller;

import com.example.quiz.model.Theme;
import com.example.quiz.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class ThemeController {
        @Autowired
        private ThemeService themeservice;


        @PostMapping( value = "/savetheme") //tnajem tekhdem hakka wella kif me bch nbaddel; tawa
        public void addTheme(@RequestBody Theme theme){  // annotation ma3 @requestBody hadhika maaneha rah bch yjik objet de type theme .. yaani les atributs elli bch tab3athhom men 8adi ykounou kif les atributs mta3 class theme exact
            themeservice.saveTheme(theme);}

        @GetMapping("/alltheme")
        public List<Theme> getAllTheme() {

            return themeservice.getAllThemeList();
        }

        @PutMapping("/updateTheme")

        public void updatetheme(@RequestBody Theme theme){
            themeservice.updateTheme(theme);

        }


        @RequestMapping(method = RequestMethod.DELETE, value = "/by/{idTheme}")
        public void deletetheme(@PathVariable long idTheme){

            themeservice.deleteTheme(idTheme);
        }

        @RequestMapping("/{idTheme}")
        public Optional<Theme> findById(@PathVariable long idTheme){

            return themeservice.findThemeById(idTheme);
        }

    }
