package com.otech;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String...args) {

        // load the configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call method on the bean
        // Lets come back to this
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
