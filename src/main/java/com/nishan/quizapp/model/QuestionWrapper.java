package com.nishan.quizapp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuestionWrapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String question_title;
}
