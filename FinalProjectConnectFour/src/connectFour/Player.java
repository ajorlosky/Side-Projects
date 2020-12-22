package connectFour;

public class Player {

	private String name;
	private String color;
	public Player(String n, String c)
	{
		name = n;
		color = c;
	}
	public String getProfile()
	{
		return "It is " + name + "'s turn! Go team " + color;
	}
	public String getColor()
	{
		return color;
	}
	
}
