package battleship;

public class Player {

	private String name;
	public Player(String n)
	{
		name = n;
	}
	public String getProfile()
	{
		return "It is " + name + "'s turn!";
	}
	public String getName()
	{
		return name;
	}
	
}
