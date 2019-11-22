import java.util.Scanner;

public class Rectangle {

    private double height;
    private double width;
    private double perimeter;
    private double area;
    private boolean isSquare;
    Scanner scanner = new Scanner(System.in);

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
        if (width == height) setSquare(true);
    }

    public Rectangle(double width) {
        setSquare(true);
        setWidth(width);
        setHeight(width);
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    public double calculateRectPerimeter() {
        setPerimeter((getHeight() + getWidth())*2);
        return perimeter;
    }

    public double calculateRectPerimeter(double width, double height) {
        setWidth(width);
        setHeight(height);
        setPerimeter((getHeight() + getWidth())*2);
        return perimeter;
    }

    private void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double calculateRectArea(double width, double height) {
        setWidth(width);
        setHeight(height);
        setArea(getHeight() * getWidth());
        return area;
    }

    public double calculateRectArea() {
        setArea(getHeight() * getWidth());
        return area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    public void introduce() {
        System.out.println("Rectangle width: " + this.getWidth());
        System.out.println("Rectangle height: " + this.getHeight());
        if (isSquare) System.out.println("I am a square!");
    }

    public boolean isSquare() {
        return isSquare;
    }

    private void setSquare(boolean square) {
        isSquare = square;
    }

    public void calculateWithInputs() {
        System.out.println("Enter the width:");
        setWidth(scanner.nextDouble());
        System.out.println("Enter the height:");
        setHeight(scanner.nextDouble());
        System.out.println("Perimeter " + calculateRectPerimeter());
        System.out.println("Area: " + calculateRectArea());
    }
}
