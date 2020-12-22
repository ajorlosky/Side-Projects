package practiceCodeCircles;

public class Circle {
	private double radius; 
	private static final double PI = 3.14;
	private static double total = 0;
	private static int count = 0;
	
	public Circle()
	{
		radius=1;
		total+= radius;
		count++;
	}

	public Circle(double r)
	{
		radius = r;
		total +=radius;
		count ++;
	}
	public double getRadius()
	{
		return(radius);
	}
	public double getArea()
	{
		return(PI*radius*radius);
	}
	public void changeRadius(double r)
	{
		total+=(radius-r);
		radius=r;
	}
	public static double getAverage()
	{
		return(total/count);
	}
}
