package co.com.ias.labs.solid.api.controller;
import co.com.ias.labs.solid.api.json.CalculationRequest;
import co.com.ias.labs.solid.api.service.ProcessCalculation;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class Calculator {
//    private final MyUseCase useCase;

    ProcessCalculation processCalculation;

    @GetMapping(path = "/calculate")
    public Double calculate(@RequestBody CalculationRequest calculationRequest) {

        return processCalculation.process(calculationRequest.getFirst(),
                calculationRequest.getSecond(), calculationRequest.getOperation());
    }
}
