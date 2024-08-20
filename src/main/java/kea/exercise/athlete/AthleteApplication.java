package kea.exercise.athlete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AthleteApplication {

    public static void main(String[] args) {
        SpringApplication.run(AthleteApplication.class, args);
        System.out.println("Athlete app is running");
    }

}
