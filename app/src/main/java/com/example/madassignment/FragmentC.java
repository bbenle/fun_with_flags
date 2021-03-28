package com.example.madassignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentC extends Fragment
{
    // private class fields
    private TextView points, pointsToWin;
    private Button backButton;
    private Fragment frag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup ui, Bundle bundle)
    {
        View view = inflater.inflate(R.layout.fragment_c, ui, false);

        points = (TextView) view.findViewById(R.id.points);
        pointsToWin = (TextView) view.findViewById(R.id.winningPointsFragC);
        backButton = (Button) view.findViewById(R.id.backButton);

        updatePointsText(); // updates the points

        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // if there are Fragments in the back stack, pop the stack and get the previous Fragment from the stack
                if (getFragmentManager().getBackStackEntryCount() > 0)
                {
                    getFragmentManager().popBackStackImmediate();
                }

                setTheFragment(); // sets the fragment
                prevButtonHider(); // hides the previous button
                updatePointsText(); // updates the users points
            }
        });
        backButton.setVisibility(View.INVISIBLE); // sets the visibility of the back button as invisible
        return view;
    }

    // updates the points that the user currently has
    public void updatePointsText()
    {
        points.setText("Points: " + PlayerSingleton.getPoints());
        pointsToWin.setText("Win: " + PlayerSingleton.getWinningPoints());
    }

    // if the Fragment is of type FragmentB, set the back button to be invisible
    // else shows the back button (for FragmentD and FragmentE)
    public void prevButtonHider()
    {
        if (frag instanceof FragmentB)
        {
            backButton.setVisibility(View.INVISIBLE);
        }
        else
        {
            backButton.setVisibility(View.VISIBLE);
        }
    }

    // sets variable frag to be whatever the current Fragment is
    public void setTheFragment()
    {
        this.frag = (Fragment) getFragmentManager().findFragmentById(R.id.fragmentContainer);
    }
}