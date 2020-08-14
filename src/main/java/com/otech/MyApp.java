package com.otech;

public class MyApp {

    public static void main(String[] args) {
        Coach myCoach = new TennisCoach();
        System.out.println();
        System.out.println(myCoach.getDailyWorkout());
        System.out.println();
    }
}