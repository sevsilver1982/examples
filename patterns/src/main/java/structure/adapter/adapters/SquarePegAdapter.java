package structure.adapter.adapters;

import structure.adapter.round.RoundPeg;
import structure.adapter.square.SquarePeg;

/**
 *  Адаптер вычисляет наименьший радиус окружности, в которую можно вписать квадратный колышек,
 *  и представляет его как круглый колышек с этим радиусом
 */
public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public Double getRadius() {
        // вычислить половину диагонали квадратного колышка по теореме Пифагора
        return peg.getWidth() * Math.sqrt(2) / 2;
    }

}