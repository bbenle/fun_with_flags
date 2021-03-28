package com.example.madassignment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentE extends Fragment
{
    // private class field
    private TextView questionText;
    private Button answer1, answer2, answer3, answer4;
    private FragmentC fragC;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup ui, Bundle bundle)
    {
        View view = inflater.inflate(R.layout.fragment_e, ui, false);

        questionText = (TextView) view.findViewById(R.id.questionText);
        answer1 = (Button) view.findViewById(R.id.answerButton1);
        answer2 = (Button) view.findViewById(R.id.answerButton2);
        answer3 = (Button) view.findViewById(R.id.answerButton3);
        answer4 = (Button) view.findViewById(R.id.answerButton4);

        if (QuestionData.getSelectedQuestion() != null)
        {
            questionText.setText(QuestionData.getSelectedQuestion().getQuestion()); // sets question text to be the question
            answer1.setText(QuestionData.getSelectedQuestion().getAnswer1()); // sets answer 1
            answer2.setText(QuestionData.getSelectedQuestion().getAnswer2()); // sets answer 2
            answer3.setText(QuestionData.getSelectedQuestion().getAnswer3()); // sets answer 3
            answer4.setText(QuestionData.getSelectedQuestion().getAnswer4()); // sets answer 4

            // hides buttons for questions with 2-3 answers (not 4)
            hideButtons();

            answer1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String choice1 = QuestionData.getSelectedQuestion().getAnswer1();
                    String theAnswer = QuestionData.getSelectedQuestion().getCorrectAnswer();

                    // if choice 1 is equal to the answer, sends a toast message, add points to user and sets isCorrect to true
                    if (choice1.equals(theAnswer)) {
                        correctNotifier();
                        addPoints();
                        QuestionData.getSelectedQuestion().setIsCorrect(true); // set isCorrect to true
                    }
                    else // else deduct points
                    {
                        incorrectNotifier();
                        subtractPoints();
                    }
                    QuestionData.getSelectedQuestion().setIsAnswered(true); // set isAnswered to true

                    boolean questionAnswered = QuestionData.getSelectedQuestion().getIsAnswered();

                    // if the question is answered (correct or incorrectly), it disables the buttons
                    if (questionAnswered == true)
                    {
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                        answer3.setEnabled(false);
                        answer4.setEnabled(false);
                    }
                }
            });

            answer2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String choice2 = QuestionData.getSelectedQuestion().getAnswer2();
                    String theAnswer = QuestionData.getSelectedQuestion().getCorrectAnswer();

                    // if choice 2 is equal to the answer, sends a toast message, add points to user and sets isCorrect to true
                    if (choice2.equals(theAnswer))
                    {
                        correctNotifier();
                        addPoints();
                        QuestionData.getSelectedQuestion().setIsCorrect(true); // set isCorrect to true
                    }
                    else // else deduct points
                    {
                        incorrectNotifier();
                        subtractPoints();
                    }

                    QuestionData.getSelectedQuestion().setIsAnswered(true); // set isAnswered to true
                    boolean questionAnswered = QuestionData.getSelectedQuestion().getIsAnswered();

                    // if the question is answered (correct or incorrectly), it disables the buttons
                    if (questionAnswered == true)
                    {
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                        answer3.setEnabled(false);
                        answer4.setEnabled(false);
                    }
                }
            });

            answer3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String choice3 = QuestionData.getSelectedQuestion().getAnswer3();
                    String theAnswer = QuestionData.getSelectedQuestion().getCorrectAnswer();

                    // if choice 3 is equal to the answer, sends a toast message, add points to user and sets isCorrect to true
                    if (choice3.equals(theAnswer)) {
                        correctNotifier();
                        addPoints();
                        QuestionData.getSelectedQuestion().setIsCorrect(true); // set isCorrect to true
                    }
                    else // else deduct points
                    {
                        incorrectNotifier();
                        subtractPoints();
                    }
                    QuestionData.getSelectedQuestion().setIsAnswered(true); // set isAnswered to true
                    boolean questionAnswered = QuestionData.getSelectedQuestion().getIsAnswered();

                    // if the question is answered (correct or incorrectly), it disables the buttons
                    if (questionAnswered == true) {
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                        answer3.setEnabled(false);
                        answer4.setEnabled(false);
                    }
                }
            });

            answer4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String choice4 = QuestionData.getSelectedQuestion().getAnswer4();
                    String theAnswer = QuestionData.getSelectedQuestion().getCorrectAnswer();

                    // if choice 3 is equal to the answer, sends a toast message, add points to user and sets isCorrect to true
                    if (choice4.equals(theAnswer)) {
                        correctNotifier();
                        addPoints();
                        QuestionData.getSelectedQuestion().setIsCorrect(true); // set isCorrect to true
                    }
                    else // else deduct points
                    {
                        incorrectNotifier();
                        subtractPoints();
                    }
                    QuestionData.getSelectedQuestion().setIsAnswered(true); // set isAnswered to true
                    boolean questionAnswered = QuestionData.getSelectedQuestion().getIsAnswered();

                    if (PlayerSingleton.getPoints() >= PlayerSingleton.getWinningPoints()) {
                        Toast.makeText(getActivity(), "You have won", Toast.LENGTH_SHORT);
                    }

                    // if the question is answered (correct or incorrectly), it disables the buttons
                    if (questionAnswered == true) {
                        answer1.setEnabled(false);
                        answer2.setEnabled(false);
                        answer3.setEnabled(false);
                        answer4.setEnabled(false);
                    }
                }
            });
        }
        return view;
    }

    // add points to the users score when user answers a question correctly
    public void addPoints()
    {
        int points = PlayerSingleton.get().getPoints();
        int awardedPoints = QuestionData.getSelectedQuestion().getPoints();

        PlayerSingleton.setPoints(points + awardedPoints);
    }

    // deduct points to the users score when users answers a question incorrectly
    public void subtractPoints()
    {
        int points = PlayerSingleton.get().getPoints();
        int penalty = QuestionData.getSelectedQuestion().getPenalty();

        PlayerSingleton.setPoints(points - penalty);
    }

    // hide buttons, this is used for when a question has either 2 or 3 answers
    // if the answer is null it will turn those buttons invisible
    public void hideButtons()
    {
        if (QuestionData.getSelectedQuestion().getAnswer3() == null)
        {
            answer3.setVisibility(View.INVISIBLE);
        }
        if (QuestionData.getSelectedQuestion().getAnswer4() == null)
        {
            answer4.setVisibility(View.INVISIBLE);
        }
    }

    // send a toast message if answer is correct
    public void correctNotifier()
    {
        Toast toast = Toast.makeText(getActivity(), "Correct", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 190);
        toast.show();
    }

    // send a toast message is incorrect
    public void incorrectNotifier()
    {
        Toast toast = Toast.makeText(getActivity(), "Incorrect", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 190);
        toast.show();
    }

    // SETTERS
    public void setFragC(FragmentC fragC)
    {
        this.fragC = fragC;
    }
}
