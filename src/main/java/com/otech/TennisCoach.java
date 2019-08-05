package com.otech;

public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Be an awesome tennis player!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
