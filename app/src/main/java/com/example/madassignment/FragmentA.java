package com.example.madassignment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

public class FragmentA extends Fragment
{
    // private class field
    private GridLayoutManager glmB, glmD;
    private Fragment frag;
    private FragmentB fragB;
    private FragmentD fragD;
    private View view;

    int orientation = GridLayoutManager.VERTICAL; // sets the default orientation as vertical - as the spec states

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup ui, Bundle bundle)
    {
        view = inflater.inflate(R.layout.fragment_a, ui, false);

        Button button1 = (Button) view.findViewById(R.id.button1); // button 1 is 1 column
        Button button2 = (Button) view.findViewById(R.id.button2); // button 2 is 2 columns
        Button button3 = (Button) view.findViewById(R.id.button3); // button 3 is 3 columns
        Button button4 = (Button) view.findViewById(R.id.button4); // button 4 is changing the orientation from vertical to horizontal

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // if the current Fragment is B, sets the columns for B to 1
                if (frag instanceof FragmentB)
                {
                    fragB.setColumn(1);
                }
                else // else sets the columns for Fragment D to 1
                {
                    fragD.setColumnFragD(1);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // if the current Fragment is B, sets the columns for B to 2
                if (frag instanceof FragmentB)
                {
                    fragB.setColumn(2);
                }
                else // else sets the columns for Fragment D to 2
                {
                    fragD.setColumnFragD(2);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // if the current Fragment is B, sets the columns for B to 3
                if (frag instanceof FragmentB)
                {
                    fragB.setColumn(3);
                }
                else // else sets the columns for Fragment D to 3
                {
                    fragD.setColumnFragD(3);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                changeOrientation(); // changes the orientation (vertical and horizontal)
            }

        });
            return view;
    }

    // changes the orientation of GridLayoutManager
    public void changeOrientation()
    {
        glmB = fragB.getGridLayoutManager(); // GridLayoutManager for Fragment B
        glmD = fragD.getGridLayoutManager(); // GridLayoutManager for Fragment D

        // if the current orientation is vertical, change it to horizontal and set variable "orientation" to horizontal
        if (frag instanceof FragmentB)
        {
            if (orientation == GridLayoutManager.VERTICAL)
            {
                glmB.setOrientation(GridLayoutManager.HORIZONTAL);
                orientation = GridLayoutManager.HORIZONTAL;
            }
            else {
                // otherwise sets orientation to vertical
                glmB.setOrientation(GridLayoutManager.VERTICAL);
                orientation = GridLayoutManager.VERTICAL;
            }
        }
        else
        {
            if (orientation == GridLayoutManager.VERTICAL)
            {
                glmD.setOrientation(GridLayoutManager.HORIZONTAL);
                orientation = GridLayoutManager.HORIZONTAL;
            }
            else {
                // otherwise sets orientation to vertical
                glmD.setOrientation(GridLayoutManager.VERTICAL);
                orientation = GridLayoutManager.VERTICAL;
            }
        }
    }

    // SETTERS
    public void setFragB(FragmentB fragB)
    {
        this.fragB = fragB;
    }

    public void setFragD(FragmentD fragD)
    {
        this.fragD = fragD;
    }

    // sets the variable "frag" to be whatever the current Fragment is
    public void setTheFragment()
    {
        this.frag = (Fragment) getFragmentManager().findFragmentById(R.id.fragmentContainer);
    }
}
