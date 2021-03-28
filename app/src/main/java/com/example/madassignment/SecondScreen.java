package com.example.madassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class SecondScreen extends AppCompatActivity
{
    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        FragmentA fragA = (FragmentA) fm.findFragmentById(R.id.fragA);
        FragmentB fragB = (FragmentB) fm.findFragmentById(R.id.fragmentContainer);
        FragmentC fragC = (FragmentC) fm.findFragmentById(R.id.fragC);
        FragmentD fragD = (FragmentD) fm.findFragmentById(R.id.fragmentContainer);
        FragmentE fragE = (FragmentE) fm.findFragmentById(R.id.fragmentContainer);

        if (fragA == null)
        {
            fragA = new FragmentA();
            fm.beginTransaction().add(R.id.fragA, fragA).commit();
        }

        if (fragB == null)
        {
            fragB = new FragmentB();
            fm.beginTransaction().add(R.id.fragmentContainer, fragB).commit();
        }

        if (fragC == null)
        {
            fragC = new FragmentC();
            fm.beginTransaction().add(R.id.fragC, fragC).commit();
        }

        if (fragD == null)
        {
            fragD = new FragmentD();
        }

        if (fragE == null)
        {
            fragE = new FragmentE();
        }

        // this is used to pass data around between fragments
        // each fragment has a private class field and setters and getters
        fragA.setFragB(fragB);
        fragD.setFragA(fragA);
        fragB.setFragD(fragD);
        fragB.setFragC(fragC);
        fragD.setFragC(fragC);
        fragE.setFragC(fragC);
        fragD.setFragE(fragE);
        fragA.setFragD(fragD);
        fragB.setFragA(fragA);
        fragB.setFragE(fragE);

        // this is for tablet mode
        if (getString(R.string.device_configuration).equals("Tablet"))
        {
            findViewById(R.id.fragmentContainer2).setVisibility(View.GONE);
        }
    }
}
