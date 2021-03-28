package com.example.madassignment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FragmentD extends Fragment
{
    // private class field
    private GridLayoutManager glm;
    private Button questionButton;
    private FragmentA fragA;
    private FragmentC fragC;
    private FragmentE fragE;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup ui, Bundle bundle)
    {
        View view = inflater.inflate(R.layout.fragment_d, ui, false);

        // starts off with 2 columns and vertical scrolling
        glm = new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.fragment_d);
        rv.setLayoutManager(glm);

        List<Question> data = FlagData.getSelectedFlag().getQuestionList();

        MyAdapter adapter = new MyAdapter(data);
        rv.setAdapter(adapter);

        fragC.setTheFragment(); // sets the current fragment
        fragC.prevButtonHider(); // hides the previous button

        // if the points is greater or equal to the points required to win, have a toast notification stating the user has won
        if (PlayerSingleton.getPoints() >= PlayerSingleton.getWinningPoints()) {
            Toast toast = Toast.makeText(getActivity(), "You have won!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 190);
            toast.show();
        }
        else if (PlayerSingleton.getPoints() <= 0)
        {
            Toast toast = Toast.makeText(getActivity(), "You have lost ...", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 190);
            toast.show();
        }

        fragA.setTheFragment(); // sets the current fragment
        return view;
    }

    private class MyAdapter extends RecyclerView.Adapter<FragmentD.MyDataVHolder>
    {
        private List<Question> data;

        public MyAdapter(List<Question> data) {
            this.data = data;
        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        @Override
        public FragmentD.MyDataVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater li = LayoutInflater.from(getActivity());
            return new FragmentD.MyDataVHolder(li, parent);
        }

        @Override
        public void onBindViewHolder(FragmentD.MyDataVHolder vh, int index)
        {
            vh.bind(data.get(index));
        }
    }

    private class MyDataVHolder extends RecyclerView.ViewHolder
    {
        private Question selectedQuestion;

        public MyDataVHolder(LayoutInflater li, ViewGroup parent)
        {
            super(li.inflate(R.layout.question_button, parent, false));

            questionButton = (Button) itemView.findViewById(R.id.questionButton);

            questionButton.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    QuestionData.setSelectedQuestion(selectedQuestion);

                    FragmentTransaction ft = getFragmentManager().beginTransaction();

                    // if the selected question is answered, send a toast message saying it has been answered
                    if (selectedQuestion.getIsAnswered())
                    {
                        Toast toast = Toast.makeText(getActivity(), "This question has already been answered!", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 190);
                        toast.show();
                    }
                    else // if selected question has not been answered, do the following ...
                    {
                        // this section is for tablet mode
                        if (getString(R.string.device_configuration).equals("Tablet"))
                        {
                            // detach and re-attach the fragment so that it updates instantly when in tablet mode
                            // without this, the user would have to go back to fragment B and then fragment D again to update changes
                            ft.detach(fragE);
                            ft.attach(fragE);
                            ft.show(fragE); // show is here because Fragment E was hidden
                        }
                        else // this section is for phone mode
                        {
                            ft.replace(R.id.fragmentContainer, fragE);  // replaces the fragment container with Fragment E
                            ft.addToBackStack(null); // replaced transaction is saved to the back stack so user can reverse the transaction
                            ft.hide(getFragD()); // hides Fragment D
                            ft.hide(fragA); // hides Fragment A
                        }
                        ft.commit();

                        fragC.setTheFragment(); // sets the current fragment
                        fragC.prevButtonHider(); // hides the previous button
                    }
                }
            });
        }

        public void bind(Question data)
        {
            this.selectedQuestion = data;

            if (data.getIsAnswered()) {
                questionButton.setEnabled(false);
            }

            // this only occurs if the question is a special question
            if (data.getIsSpecial() == true) // default is true
            {
                // makes the text on the button display if its a special, the question number, points and penalty
                questionButton.setText("Special\n" + data.getQuestionNum() + "\nPoints: " + data.getPoints() + "\nPenalty: " + data.getPenalty());

                // if the question was answered correctly, enter this if statement
                if (data.getIsCorrect() == true)
                {
                    List<Question> questionList = FlagData.getSelectedFlag().getQuestionList();

                    // for each loop - for each Question in the question list, set the points to be current points + 10
                    for (Question q: questionList)
                    {
                        q.setPoints(q.getPoints() + 10); // add 10 points when a special question is answered correctly
                    }
                }
            }
            else
            {
                // if it is a non special question, display question number, points and penalty
                questionButton.setText(data.getQuestionNum() + "\nPoints: " + data.getPoints() + "\nPenalty: " + data.getPenalty());
            }
        }
    }

    // GETTERS
    public GridLayoutManager getGridLayoutManager()
    {
        return glm;
    }

    public FragmentD getFragD()
    {
        return this;
    }

    // SETTERS
    public void setFragA(FragmentA fragA)
    {
        this.fragA = fragA;
    }

    public void setFragC(FragmentC fragC)
    {
        this.fragC = fragC;
    }

    public void setFragE(FragmentE fragE)
    {
        this.fragE = fragE;
    }

    // sets the GridLayoutManager to have a certain amount of columns ranging from 1-3
    public void setColumnFragD(int col)
    {
        getGridLayoutManager();
        glm.setSpanCount(col);
    }
}
