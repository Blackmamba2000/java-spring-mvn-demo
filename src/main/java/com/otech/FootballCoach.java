package com.otech;

public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Score a touchdown!!!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
