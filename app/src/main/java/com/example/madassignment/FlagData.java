package com.example.madassignment;

import java.util.Arrays;
import java.util.List;

// singleton class
public class FlagData
{
    // private class field
    // hardcode a starting selected flag so the application doesn't crash due to selected flag being null at the start
    private static Flag selectedFlag = new Flag(R.drawable.flag_au, "Australia", QuestionData.get().getAustraliaQuestionList());

    private static List<Flag> flagList = Arrays.asList(
            new Flag(R.drawable.flag_au, "Australia", QuestionData.get().getAustraliaQuestionList()),
            new Flag(R.drawable.flag_vn, "Vietnam", QuestionData.get().getVietnamQuestionList()),
            new Flag(R.drawable.flag_jp, "Japan", QuestionData.get().getJapanQuestionList()),
            new Flag(R.drawable.flag_my, "Malaysia", QuestionData.get().getMalaysiaQuestionList()),
            new Flag(R.drawable.flag_uk, "United Kingdom", QuestionData.get().getUKQuestionList()),
            new Flag(R.drawable.flag_br, "Brazil", QuestionData.get().getBrazilQuestionList()),
            new Flag(R.drawable.flag_us, "United States of America", QuestionData.get().getUSAQuestionList()),
            new Flag(R.drawable.flag_kr, "Korea", QuestionData.get().getKoreaQuestionList()),
            new Flag(R.drawable.flag_ca, "Canada", QuestionData.get().getCanadaQuestionList()),
            new Flag(R.drawable.flag_es, "Spain", QuestionData.get().getSpainQuestionList()),
            new Flag(R.drawable.flag_de, "Germany", QuestionData.get().getGermanyQuestionList()),
            new Flag(R.drawable.flag_ru, "Russia", QuestionData.get().getRussiaQuestionList()),
            new Flag(R.drawable.flag_gr, "Greece", QuestionData.get().getGreeceQuestionList()),
            new Flag(R.drawable.flag_ar, "Argentina", QuestionData.get().getArgentinaQuestionList()),
            new Flag(R.drawable.flag_cn, "China", QuestionData.get().getChinaQuestionList()),
            new Flag(R.drawable.flag_fr, "France", QuestionData.get().getFranceQuestionList()));

    private static FlagData instance = null;

    public static FlagData get()
    {
        if (instance == null)
        {
            instance = new FlagData();
        }
        return instance;
    }

    protected FlagData() {}

    public Flag get(int i)
    {
        return flagList.get(i);
    }

    public int size()
    {
        return flagList.size();
    }

    public void add(Flag c)
    {
        flagList.add(0, c);
    }

    public void remove(int i)
    {
        flagList.remove(i);
    }

    // GETTERS
    // returns the selected flag (flag that was clicked by the user)
    public static Flag getSelectedFlag()
    {
        return selectedFlag;
    }

    // SETTERS
    // sets the selected flag as the flag clicked by the user
    public static void setSelectedFlag(Flag selectedFlag)
    {
        FlagData.selectedFlag = selectedFlag;
    }
}