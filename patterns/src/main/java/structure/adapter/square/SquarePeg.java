package structure.adapter.square;

/**
 *  Устаревший, несовместимый класс: квадратный колышек
 */
public class SquarePeg {
    private final Double width;

    public SquarePeg(Double width) {
        this.width = width;
    }

    public Double getWidth() {
        // вернуть ширину квадратного колышка
        return this.width;
    }

}