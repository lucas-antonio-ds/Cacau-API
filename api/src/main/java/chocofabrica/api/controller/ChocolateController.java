package chocofabrica.api.controller;

import chocofabrica.api.service.ChocolateService;
import chocofabrica.api.strategy.ChocolateAStrategy;
import chocofabrica.api.strategy.ChocolateBStrategy;
import chocofabrica.api.strategy.ChocolateCStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chocolate")
public class ChocolateController {
    private final ChocolateService chocolateService;

    public ChocolateController(ChocolateService chocolateService) {
        this.chocolateService = chocolateService;
    };

    @GetMapping("/{type}")
    public int getPorcentagemCacau(@PathVariable String type){
        switch (type) {
            case "A" -> chocolateService.setStrategy(new ChocolateAStrategy());
            case "B" -> chocolateService.setStrategy(new ChocolateBStrategy());
            case "C" -> chocolateService.setStrategy(new ChocolateCStrategy());
            default -> throw new IllegalArgumentException("Invalid chocolate type: " + type);
        }
        return chocolateService.getPorcentagemCacau();
    };

};
