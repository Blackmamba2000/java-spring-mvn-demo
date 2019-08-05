package com.otech;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String teamName;

    // create a no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: : inside no-arg constructor!");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket Coach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
