package lesson_13;

public class RightTriangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    public RightTriangle (String color, double sideA,double sideB,double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Method calculates area
     *
     * @return calculated area of the shape.
     */
    @Override
    public String toString() {
        return "Right Triangle {" +
                "sideA = " + sideA +
                "sideB = " + sideB +
                "sideC = " + sideC +
                " " + super.toString();
    }

    /**
     * Method calculates area
     *
     * @return calculated area of the shape.
     */
    @Override
    public double calculateArea() {return (sideA * sideB)/2;}

    @Override
    public double calculatePerimeter() { return sideA + sideB + sideC;}
}
