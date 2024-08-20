package kea.exercise.athlete.Repositories;

import kea.exercise.athlete.entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result, Integer> {
}
