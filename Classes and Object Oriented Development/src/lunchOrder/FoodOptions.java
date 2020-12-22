/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *2/26/18
 *FoodOptions.java
 *Object Class
 *This program will prompt the user for the number of hamburgers, salads, french fries, and sodas in a lunch order, display the total order cost, and ask the user if he or she would like to place another order.
 */
package lunchOrder;
public class FoodOptions {

	double price, fat, carbohydrates, fiber;//creates the class variables for each nutrition fact
	public FoodOptions(double p, double fa, double carb, double fi)//constructor method sets the value of the parameters for each food item to the static variable
	{
		price=p;//initializes the price of each food item to its value in the parameters
		fat=fa;//initializes the fat of each food item to its value in the parameters
		carbohydrates= carb;//initializes the carbohydrates in each food item to its value in the parameters
		fiber=fi;//initializes the fiber in each food item to its value in the parameters
	}
	public double getFat()
	{
		return(fat);//returns the value of the amount of fat for each food item
	}
	public double getCarbs()
	{
		return(carbohydrates);//returns the value of the amount of carbohydrates for each food item
	}
	public double getFiber()
	{
		return(fiber);//returns the value of the amount of fiber for each food item
	}
	public double getPrice()
	{
		return(price);//returns the value of the price for each food item
	}
	
}
