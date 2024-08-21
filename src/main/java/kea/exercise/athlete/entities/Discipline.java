package kea.exercise.athlete.entities;

import jakarta.persistence.*;
import kea.exercise.athlete.enums.DisciplinNameEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private DisciplinNameEnum name;
    @ManyToMany
    private List<Participant> participants;

    public Discipline(DisciplinNameEnum name, List<Participant> participants) {
        this.name = name;
        this.participants = participants;
    }
}
