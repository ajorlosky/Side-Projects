/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *2/8/18
 *Rectangle.java
 *Object Class
 * *This program will prompt the user for the dimensions of a rectangle and calculates the diagonal, area, perimeter, and determine if the rectangle is a square.
 */
package rectangleCode;
import java.lang.Math;
public class Rectangle {
	private double length;
	private double width;
	private double diagonal;
	private double perimeter;
	
	public void setLength(double l)
	{
		length=l;
	}
	public void setWidth(double w) 
	{
		width=w;
	} 
	public double getLength()
	{
		return(length);
	}
	public double getWidth()
	{
		return(width);	
	}
	public double getDiagonal()
	{
		diagonal=Math.sqrt(Math.pow(length,2) + Math.pow(width, 2));
		diagonal = diagonal%4.2f;
		return(diagonal);
	}
	public double getArea()
	{
		return(length * width);
	}
	public double getPerimeter() 
	{
		perimeter=(2*length) + (2* width);
		return(perimeter);
	}
	public String isSquare()
	{
		if(length==width)
		{
			return("yes");
		}
		else
		{
			return("no");
		}
	}
}
