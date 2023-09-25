package org.example;
import java.util.*;

public abstract class Question {

    private final ArrayList<String> correctAnswers;
    private final String questionDescription;
    private final ArrayList<String> answerOptions;
    private String questionType;

    public Question(ArrayList<String> correctAnswers, String questionDescription, ArrayList<String> answerOptions) {
        this.correctAnswers = correctAnswers;
        this.questionDescription = questionDescription;
        this.answerOptions = answerOptions;
    }

    public ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public Boolean checkAnswer(String userAnswer) {
        //TODO compare user answer to correct answer
        if ( questionType.equals("checkbox")){
            //TODO Multiple Choice loop
            return false;
        } else {
            if (userAnswer.toLowerCase().equals(String.join("", correctAnswers).toLowerCase())) {
                //Save this as a correct answer
                System.out.println("Correct!");
                return true;
            } else {
                System.out.println("WRONG!");
                return false;
            }
        }
    }

    @Override
    public String toString(){
        String newline = System.lineSeparator();
        return questionDescription + newline + String.join(newline, answerOptions) + newline;
    }
}
