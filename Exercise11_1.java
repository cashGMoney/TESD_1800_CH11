// Added Scanner
import java.util.Scanner;

public class Exercise11_1 {
  public static void main(String[] args) {
    // Allow Scanner input
    Scanner input = new Scanner(System.in);

    // Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled.
    System.out.print("Enter side1 of the triangle: ");
    double input1 = input.nextDouble();

    System.out.print("Enter side2 of the triangle: ");
    double input2 = input.nextDouble();

    System.out.print("Enter side3 of the triangle: ");
    double input3 = input.nextDouble();

    // Breaker
    input.nextLine();

    System.out.print("Enter the color of the triangle: ");
    String color = input.nextLine();

    System.out.print("Is the Triangle Filled? (true or false): ");
    Boolean filled = input.nextBoolean();

    Triangle triangle = new Triangle(input1, input2, input3);
    triangle.setColor(color);
    triangle.setFilled(filled);
    System.out.println("\nA " + triangle.toString());
    System.out.println("The area is " + triangle.getArea());
    System.out.println("The perimeter is " + triangle.getPerimeter());
    System.out.println("The color is " + triangle.getColor());
    System.out.println("The date created is " + triangle.getDateCreated());

    // Close the Scanner object
    input.close();
  }
}