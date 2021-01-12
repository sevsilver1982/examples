package structure.adapter.round;

/**
 *  Круглый колышек
 */
public class RoundPeg {
    private Double radius;

    public RoundPeg() {
    }

    public RoundPeg(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        // вернуть радиус круглого колышка
        return this.radius;
    }

}