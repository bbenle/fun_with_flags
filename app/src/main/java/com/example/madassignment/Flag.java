package com.example.madassignment;

import java.util.List;

public class Flag
{
    // private class fields
    private final int drawableId;
    private String label;
    private List<Question> questionList;

    // alternate constructor
    public Flag(int drawableId, String label, List<Question> questionList)
    {
        this.drawableId = drawableId;
        this.label = label;
        this.questionList = questionList;
    }

    //GETTERS
    public int getDrawableId()
    {
        return drawableId;
    }

    // returns the name of the country
    public String getLabel()
    {
        return label;
    }

    // returns the list of questions for the countries
    public List<Question> getQuestionList()
    {
        return questionList;
    }

}
