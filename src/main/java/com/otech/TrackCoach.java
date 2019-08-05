package com.otech;

import javax.sound.midi.Track;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Run like Usain Bolt!";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }
}
