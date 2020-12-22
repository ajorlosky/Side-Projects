/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *2/8/18
 *RectangleTesting.java
 *ClientCode
 *This program will prompt the user for the dimensions of a rectangle and calculates the diagonal, area, perimeter, and determine if the rectangle is a square.
 */
package rectangleCode;

import java.util.Scanner;

public class RectangleTesting {

	public static void main (String [] args)
	{
		
		Rectangle rectangle1= new Rectangle();
		Rectangle rectangle2= new Rectangle();
		Rectangle rectangle3= new Rectangle();
		
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the length of rectangle 1: ");
		double l =input.nextDouble();
		rectangle1.setLength(l);
		
		
		System.out.print("Enter the width of rectangle 1:  ");
		double w=input.nextDouble();
		rectangle1.setWidth(w);
		
		
		System.out.print("Enter the length of rectangle 2: ");
		l=input.nextDouble();
		rectangle2.setLength(l);
		
		System.out.print("Enter the width of rectangle 2: ");
		w=input.nextDouble();
		rectangle2.setWidth(w);
		
		
		System.out.print("Enter the length of rectangle 3: ");
		l=input.nextDouble();
		rectangle3.setLength(l);
		
		System.out.print("Enter the width of rectangle 3: ");
		w=input.nextDouble();
		rectangle3.setWidth(w);
		
		input.close();
		System.out.format("%18s %15s %18s %18s %14s %15s", "Length", "Width", "Diagonal", "Perimeter", "Area", "Square\n");
		System.out.format("%s %9s %16s %10s %4.1f %18s %19s %10s\n", "Tri 1" , rectangle1.getLength() , rectangle1.getWidth() , "  ", rectangle1.getDiagonal() , rectangle1.getPerimeter() , rectangle1.getArea() , rectangle1.isSquare());
		System.out.format("%s %9s %16s %10s %4.1f %18s %19s %10s\n", "Tri 2" , rectangle2.getLength() , rectangle2.getWidth() , "  ", rectangle2.getDiagonal() , rectangle2.getPerimeter() , rectangle2.getArea() , rectangle2.isSquare());
		System.out.format("%s %9s %16s %10s %4.1f %18s %19s %10s\n", "Tri 3" , rectangle3.getLength() , rectangle3.getWidth() , "  ", rectangle3.getDiagonal() , rectangle3.getPerimeter() , rectangle3.getArea() , rectangle3.isSquare());
	}
}
