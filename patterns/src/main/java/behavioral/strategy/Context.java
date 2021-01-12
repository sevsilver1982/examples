package behavioral.strategy;

import behavioral.strategy.strategies.Strategy;

/**
 *  Контекст всегда работает со стратегиями через общий интерфейс. Он не знает, какая именно стратегия ему подана.
 */
public class Context {
    private Strategy strategy;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    Double executeStrategy(Double a, Double b) {
        return strategy.execute(a, b);
    }

}