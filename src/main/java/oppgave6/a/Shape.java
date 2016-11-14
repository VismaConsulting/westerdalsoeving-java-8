package oppgave6.a;

/**
 * 14.11.2016
 *
 * @author <a href="mailto:leo-andreas.ervik@visma.com">Leo-Andreas Ervik</a>.
 */
public class Shape {

    private final Double height;
    private final Double width;
    private final Double weight;

    public Shape(Double height, Double width, Double weight) {
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        if (height != null ? !height.equals(shape.height) : shape.height != null) return false;
        if (width != null ? !width.equals(shape.width) : shape.width != null) return false;
        return weight != null ? weight.equals(shape.weight) : shape.weight == null;

    }

    @Override
    public int hashCode() {
        int result = height != null ? height.hashCode() : 0;
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }
}
