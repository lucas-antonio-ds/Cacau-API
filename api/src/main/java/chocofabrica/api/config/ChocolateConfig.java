package chocofabrica.api.config;

import chocofabrica.api.strategy.ChocolateAStrategy;
import chocofabrica.api.strategy.ChocolateBStrategy;
import chocofabrica.api.strategy.ChocolateCStrategy;
import chocofabrica.api.strategy.ChocolateStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChocolateConfig {
    @Bean("A")
    public ChocolateStrategy chocolateAStrategy() {
        return new ChocolateAStrategy();
    }

    @Bean("B")
    public ChocolateStrategy chocolateBStrategy() {
        return new ChocolateBStrategy();
    }

    @Bean("C")
    public ChocolateStrategy chocolateTypeCStrategy() {
        return new ChocolateCStrategy();
    }
}