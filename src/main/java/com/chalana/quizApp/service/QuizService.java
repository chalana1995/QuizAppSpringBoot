package com.chalana.quizApp.service;

import com.chalana.quizApp.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
    }
}
