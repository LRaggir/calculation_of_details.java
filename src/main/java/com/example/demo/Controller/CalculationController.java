package com.example.demo.Controller;

import com.example.demo.Servis.CalculationService;
import com.example.demo.model.Calcuation;
import com.example.demo.model.Empirical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class CalculationController {
    @Autowired
    private CalculationService userRepository;

    @PostMapping("poat")
            public Calcuation Calculation (@RequestBody Empirical empirical)
    {

        return userRepository.chet(empirical);
    }

    @GetMapping
    public Iterable<Calcuation> Get()
    {
        return userRepository.Get();
    }

    @DeleteMapping
    public String delete ()
    {
        userRepository.DDelete();
        return "Ok";
    }
}
