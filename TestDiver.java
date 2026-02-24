
//MyRectagle.java
import java.util.Scanner;

public class MyRectangle {
    public double length;
    public double width;
    public double area;

    public double calculateArea() {
        this.area = this.length * this.width;
        return this.area;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        this.length = input.nextDouble();
        System.out.print("Enter width: ");
        this.width = input.nextDouble();
    }

}

// TestDriver.java
public class TestDriver {
    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle();
        rectangle.input();
        Double result = rectangle.calculateArea();
        System.out.println("The area of the rectangle is: " + result);
    }
}
