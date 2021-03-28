package com.example.madassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Player player;
    private Button start;
    private TextView logo, startingPoint, winningPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = new Player(); // creates a new player

        start = findViewById(R.id.start);
        logo = findViewById(R.id.logo);
        startingPoint = findViewById(R.id.startingPoint);
        winningPoint = findViewById(R.id.winningPoint);

        startingPoint.setText("Starting Points: " + player.getStartingPoint());
        winningPoint.setText("Winning Points: " + player.getWinningPoint());

        start.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                PlayerSingleton.setPoints(player.getStartingPoint());
                PlayerSingleton.setWinningPoints(player.getWinningPoint());
                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(intent);
            }
        });
    }
}