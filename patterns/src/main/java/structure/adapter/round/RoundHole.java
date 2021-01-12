package structure.adapter.round;

/**
 *  Круглое отверстие
 */
public class RoundHole {
    private final Double radius;

    public RoundHole(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        // вернуть радиус отверстия
        return this.radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }

}