class AreaCalculator {
    public double Area(double radius) {
        return 3.14 * radius * radius;
    }
    public double Area(double length, double width) {
        return length * width;
    }
    public int Area(int side) {
        return side * side;
    }   

}
public class Allan{
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        int squareArea = calculator.Area(5);
        double circleArea = calculator.Area(3.0);
        double rectangleArea = calculator.Area(4.0, 6.0);   
        System.out.println("Area of square: " + squareArea);
        System.out.println("Area of circle: " + circleArea);
        System.out.println("Area of rectangle: " + rectangleArea);
        

    }
}