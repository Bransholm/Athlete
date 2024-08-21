package kea.exercise.athlete.service;

import kea.exercise.athlete.Repositories.ResultRepository;
import kea.exercise.athlete.entities.Result;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResultService {
    private final ResultRepository resultRepository;

    public ResultService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    // Get all results
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    // Create a new result that returns the created result object
    public Result createResult(Result request) {
        Result result = new Result();
        setResultAttributes(result, request);
        return resultRepository.save(result);
    }

    // Sets the attributes of a result object by copying the relevant details from the request object
    private void setResultAttributes(Result resultToEdit, Result request) {
        resultToEdit.setResultType(request.getResultType());
        resultToEdit.setDate(request.getDate());
        resultToEdit.setResult(request.getResult());
    }
}
