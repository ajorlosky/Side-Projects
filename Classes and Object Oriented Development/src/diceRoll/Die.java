/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *3/8/18
 *Die.java
 *Object class for the Die
 *This program will roll a dice randomly to generate a number from 1-6.
 */
package diceRoll;

public class Die {

	private int dieValue;//value rolled by die
	public int Roll() //randomly calculates the value from 1-6 rolled by a die and returns that value
	{
		dieValue= (int) (6* Math.random() + 1);
		return(dieValue);
	}
}
