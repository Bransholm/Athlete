package kea.exercise.athlete.entities;

import jakarta.persistence.*;

import kea.exercise.athlete.enums.ParticipantAgeGroupEnum;
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
    @Enumerated(EnumType.STRING)
    private ParticipantGenderEnum gender;
    private int age;
    @Enumerated(EnumType.STRING)
    private ParticipantAgeGroupEnum ageGroup;
    private String club;

    public Participant(String name, ParticipantGenderEnum gender, int age, String club) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.club = club;
    }
}


