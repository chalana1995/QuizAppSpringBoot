package com.chalana.quizApp.controller;

import com.chalana.quizApp.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {
QuestionService quetionService;
    @GetMapping("allQuestions")
    public String getAllQuestions()
    {
       return "Hi, These are your questions";
    }
}
