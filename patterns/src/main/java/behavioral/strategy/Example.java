package behavioral.strategy;

import behavioral.strategy.strategies.Strategy;
import behavioral.strategy.strategies.StrategyAdd;
import behavioral.strategy.strategies.StrategyMultiply;
import behavioral.strategy.strategies.StrategySubtract;

/**
 *  Стратегия (Strategy)
 *  Определяет семейство схожих алгоритмов и помещает каждый из них в собственный класс, после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.
 *  В этом примере контекст использует Стратегию для выполнения той или иной арифметической операции.
 *  Конкретная стратегия выбирается на более высоком уровне, например, конфигуратором всего приложения. Готовый объект-стратегия подаётся в клиентский объект, а затем может быть заменён другой стратегией в любой момент на лету.
 */
public class Example {

    public static void main(String[] args) {
        Strategy strategy = null;
        int action = 3;

        // Каждая конкретная стратегия реализует общий интерфейс своим способом
        switch (action) {
            case 1:
                strategy = new StrategyAdd();
                break;
            case 2:
                strategy = new StrategySubtract();
                break;
            case 3:
                strategy = new StrategyMultiply();
                break;
            default:
                break;
        }
        Context context = new Context();
        context.setStrategy(strategy);
        System.out.println(context.executeStrategy(10.0, 20.0));
    }

}