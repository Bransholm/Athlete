package kea.exercise.athlete.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import kea.exercise.athlete.enums.ParticipantGenderEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor

public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private ParticipantGenderEnum gender;
    private int age;
    private String ageGroup;
    private String club;

    public Participant(String name, ParticipantGenderEnum gender, int age, String ageGroup, String club) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ageGroup = ageGroup;
        this.club = club;
    }
}


