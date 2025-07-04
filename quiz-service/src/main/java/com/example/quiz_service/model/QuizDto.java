package com.example.quiz_service.model;


import lombok.Data;

@Data
public class QuizDto {

    String categoryName;
    Integer numQuestion;
    String title;
}
