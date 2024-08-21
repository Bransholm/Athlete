package kea.exercise.athlete.controller;

import kea.exercise.athlete.entities.Result;
import kea.exercise.athlete.service.ResultService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/results")
public class ResultController {

    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping
    public List<Result> getAllResults() {
        return resultService.getAllResults();
    }

    // Create a new result
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Result addResult(@RequestBody Result request) {
        return resultService.createResult(request);
    }
}
