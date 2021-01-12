package structure.adapter;

import structure.adapter.adapters.SquarePegAdapter;
import structure.adapter.round.RoundHole;
import structure.adapter.round.RoundPeg;
import structure.adapter.square.SquarePeg;

/**
 *  Адаптер (Adapter)
 *  Позволяет объектам с несовместимыми интерфейсами работать вместе.
 *  В этом примере Адаптер преобразует один интерфейс в другой, позволяя совместить квадратные колышки и круглые отверстия.
 */
public class Example {

    public static void main(String[] args) {
        Double radiusHole = 5.0;
        Double radiusRoundPeg = 5.0;
        Double radiusSquarePeg1 = 5.0;
        Double radiusSquarePeg2 = 10.0;

        // отверстие
        RoundHole hole = new RoundHole(radiusHole);

        // колышки
        RoundPeg peg = new RoundPeg(radiusRoundPeg);
        SquarePeg squarePeg1 = new SquarePeg(radiusSquarePeg1);
        SquarePeg squarePeg2 = new SquarePeg(radiusSquarePeg2);
        SquarePegAdapter squarePeg1Adapter = new SquarePegAdapter(squarePeg1);
        SquarePegAdapter squarePeg2Adapter = new SquarePegAdapter(squarePeg2);

        System.out.println(hole.fits(peg));               // true
        //System.out.println(hole.fits(squarePeg1));      // ошибка компиляции, несовместимые типы
        System.out.println(squarePeg1Adapter.getRadius());
        System.out.println(squarePeg2Adapter.getRadius());
        System.out.println(hole.fits(squarePeg1Adapter)); // true  3 < 5
        System.out.println(hole.fits(squarePeg2Adapter)); // false 7 > 5
    }

}