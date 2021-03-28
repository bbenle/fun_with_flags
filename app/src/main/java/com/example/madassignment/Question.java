package com.example.madassignment;

public class Question
{
    // private class field
    private String question, correctAnswer;
    private String answer1, answer2, answer3, answer4, questionNum;
    private int points, penalty;
    private boolean isAnswered;
    private boolean isSpecial;
    private boolean isCorrect;

    // alternate constructor
    public Question(String question, String answer1, String answer2, String answer3, String answer4, int points, int penalty, String questionNum, String correctAnswer, boolean isSpecial)
    {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.points = points;
        this.penalty = penalty;
        this.questionNum = questionNum;
        this.correctAnswer = correctAnswer;
        this.isAnswered = false;
        this.isSpecial = isSpecial;
        isCorrect = false;
    }

    // GETTERS
    public String getQuestion()
    {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getQuestionNum()
    {
        return questionNum;
    }

    public int getPoints()
    {
        return points;
    }

    public int getPenalty()
    {
        return penalty;
    }

    public String getCorrectAnswer()
    {
        return correctAnswer;
    }

    public boolean getIsAnswered()
    {
        return isAnswered;
    }

    public boolean getIsCorrect() {
        return isCorrect;
    }

    // SETTERS
    public void setIsAnswered(boolean isAnswered)
    {
        this.isAnswered = isAnswered;
    }

    public boolean getIsSpecial()
    {
        return isSpecial;
    }

    public void setIsCorrect(boolean correct) {
        isCorrect = correct;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }
}
