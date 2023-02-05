package lesson_13;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color,double width,double height) {
        super(color);
        this.width = width;
        this.height = height;

    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "width= " + width +
                " height= " + height +
                  super.toString();
    }

    /**
     * Method calculates area
     *
     * @return calculated area of the shape.
     */
    @Override
    public double calculateArea() { return width * height;}

    @Override
    public double calculatePerimeter() { return (width + height)*2;}
}
