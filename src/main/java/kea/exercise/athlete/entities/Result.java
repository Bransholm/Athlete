package kea.exercise.athlete.entities;

import jakarta.persistence.*;
import kea.exercise.athlete.enums.ResultTypeEnum;
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
    private ResultTypeEnum resultType;
    private LocalDate date;
    private int result;
    @ManyToOne
    private Participant participant;
    @ManyToOne
    private Discipline discipline;

    public Result(ResultTypeEnum resultType, LocalDate date, int result, Participant participant, Discipline discipline) {
        this.resultType = resultType;
        this.date = date;
        this.result = result;
        this.participant = participant;
        this.discipline = discipline;
    }
}
