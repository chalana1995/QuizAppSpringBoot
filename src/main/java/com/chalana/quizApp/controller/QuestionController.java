package com.chalana.quizApp.controller;

import com.chalana.quizApp.model.Question;
import com.chalana.quizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService quetionService;


    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions()
    {
       return quetionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category)
    {
        return quetionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question)
    {
        return quetionService.addQuestion(question);
    }

    @DeleteMapping("delete/{id}")
    public void deleteQuestion(@PathVariable Integer id)
    {
        quetionService.deleteQuestion(id);
    }
}
