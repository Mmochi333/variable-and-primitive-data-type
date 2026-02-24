import java.util.Scanner;

public class Rectangle {
    public static int length;
    public static int width;
    public static int area;

    public static void main(String[] args) {

        System.out.println("Rectangle Calculator");
        Rectangle.inputInt();
        Rectangle.area = Rectangle.calcArea(length, width);
        System.out.println("The area of the rectangle is: " + area);

    }

    public static int calcArea(int length, int width) {
        int area = length * width;
        return area;
    }

    public static void inputInt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        Rectangle.length = input.nextInt();
        System.out.print("Enter width: ");
        Rectangle.width = input.nextInt();
    }

}