package com.example.madassignment;

// singleton class
public class PlayerSingleton
{
    private static int points;
    private static int winningPoints;

    private static PlayerSingleton instance = null;

    public static PlayerSingleton get() {
        if (instance == null) {
            instance = new PlayerSingleton();
        }
        return instance;
    }

    protected PlayerSingleton() {
    }

    // GETTERS
    public static int getPoints() {
        return points;
    }

    public static int getWinningPoints()
    {
        return winningPoints;
    }

    // SETTERS
    public static void setPoints(int points)
    {
        PlayerSingleton.points = points;
    }

    public static void setWinningPoints(int inWinningPoints)
    {
        winningPoints = inWinningPoints;
    }
}

