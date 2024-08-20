package kea.exercise.athlete.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String resultType;
    private LocalDate date;
    private String Club;
    @ManyToOne
    private Participant participant;
    @ManyToOne
    private Discipline discipline;
}
