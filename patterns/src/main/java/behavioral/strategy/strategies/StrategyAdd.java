package behavioral.strategy.strategies;

public class StrategyAdd implements Strategy {

    @Override
    public Double execute(Double a, Double b) {
        return a + b;
    }

}