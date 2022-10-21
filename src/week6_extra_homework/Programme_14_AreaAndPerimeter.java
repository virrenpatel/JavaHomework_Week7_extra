package week6_extra_homework;

import java.util.Scanner;

/*
 *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme_14_AreaAndPerimeter {
    // Calculating area and perimeter of rectangle
    public static void areaAndPerimeterOfRectangle(double height, double width) {
        double perimeter = 2 * (height + width);
        double area = (height * width);
        System.out.println("The area of the rectangle is : " + area);
        System.out.println("The perimeter of the rectangle is : " + perimeter);
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double width = scanner.nextDouble();
        areaAndPerimeterOfRectangle(height, width);
        // closing the scanner object
        scanner.close();
    }
}
