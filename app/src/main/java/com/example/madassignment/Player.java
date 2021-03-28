package com.example.madassignment;

import java.util.Random;

public class Player
{
    private int winningPoint;
    private int startingPoint;

    public Player()
    {
        winningPoint = randInt(100, 120);
        startingPoint = randInt(20,25);
    }

    // method to generate a random number between a minimum and maximum number
    public int randInt(int min, int max) {
        Random r = new Random();
        int result = r.nextInt((max - min) + 1) + min;

        return result;
    }

    // GETTERS
    public int getWinningPoint() {
        return winningPoint;
    }

    public int getStartingPoint() {
        return startingPoint;
    }
}
