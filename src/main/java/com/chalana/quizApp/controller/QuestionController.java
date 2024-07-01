package com.chalana.quizApp.controller;

import com.chalana.quizApp.Question;
import com.chalana.quizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService quetionService;


    @GetMapping("allQuestions")
    public List<Question> getAllQuestions()
    {
       return quetionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category)
    {
        return quetionService.getQuestionsByCategory(category);
    }
}
