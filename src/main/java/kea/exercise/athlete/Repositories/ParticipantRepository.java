package kea.exercise.athlete.Repositories;

import kea.exercise.athlete.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
}
