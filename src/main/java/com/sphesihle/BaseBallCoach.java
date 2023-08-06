package com.sphesihle;

public class BaseBallCoach implements Coach{

    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball workout ready";
    }
}
