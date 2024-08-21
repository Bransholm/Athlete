package kea.exercise.athlete.service;

import kea.exercise.athlete.Repositories.ParticipantRepository;
import kea.exercise.athlete.entities.Participant;
import kea.exercise.athlete.enums.ParticipantAgeGroupEnum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {
    private final ParticipantRepository participantRepository;

    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    // Get all participants
    public List<Participant> getAllParticipants() {
        return participantRepository.findAll();
    }


}
