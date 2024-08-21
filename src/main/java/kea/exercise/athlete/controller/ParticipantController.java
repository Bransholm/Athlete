package kea.exercise.athlete.controller;

import kea.exercise.athlete.entities.Participant;
import kea.exercise.athlete.service.ParticipantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/participants")
public class ParticipantController {

    private final ParticipantService participantService;

    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    // Get all participants
    @GetMapping
    public List<Participant> getAllParticipants() {
        return participantService.getAllParticipants();
    }




}
