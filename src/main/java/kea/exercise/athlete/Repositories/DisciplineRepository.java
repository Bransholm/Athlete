package kea.exercise.athlete.Repositories;

import kea.exercise.athlete.entities.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {
}
