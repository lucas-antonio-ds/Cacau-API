package chocofabrica.api.service;

import chocofabrica.api.strategy.ChocolateStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChocolateService {

    private ChocolateStrategy chocolateStrategy;

    public void setStrategy(@Autowired ChocolateStrategy chocolateStrategy) {
        this.chocolateStrategy = chocolateStrategy;
    };
    public int getPorcentagemCacau(){

        return chocolateStrategy.getPorcentagemCacau();
    }
}


