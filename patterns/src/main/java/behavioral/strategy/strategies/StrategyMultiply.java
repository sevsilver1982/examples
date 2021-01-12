package behavioral.strategy.strategies;

public class StrategyMultiply implements Strategy {

    @Override
    public Double execute(Double a, Double b) {
        return a * b;
    }

}