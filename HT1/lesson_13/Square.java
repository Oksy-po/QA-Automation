package lesson_13;

public class Square extends Shape{
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    /**
     * Method calculates area
     *
     * @return calculated area of the shape.
     */
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " " + super.toString();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
