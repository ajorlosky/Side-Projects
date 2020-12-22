package practiceCodeCircles;

public class CircleMaker {
	public static void main (String [] args)
	{
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle(3);
		
		System.out.println("The radius of circle 1 is " + circle1.getRadius());
		System.out.println("The radius of circle 2 is " + circle2.getRadius());
		System.out.println("The radius of circle 3 is " + circle3.getRadius());
		
		circle2.changeRadius(7);
		
		System.out.println("The radius of circle 1 is " + circle1.getRadius());
		System.out.println("The radius of circle 2 is " + circle2.getRadius());
		System.out.println("The radius of circle 3 is " + circle3.getRadius());
		
	}
}
