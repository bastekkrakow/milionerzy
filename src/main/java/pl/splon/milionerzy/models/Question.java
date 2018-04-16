package pl.splon.milionerzy.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Question {

    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correct;


}
