package com.shubhashish.quizapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("question")
class QuestionController {
    @GetMapping("allQuestions")
    public String getAllQuestions(){
        return "Hi, These are your questions";
    }
}
