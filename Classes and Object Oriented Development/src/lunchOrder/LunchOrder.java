/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *2/26/18
 *LunchOrder.java
 *Client Code
 *This program will prompt the user for the number of hamburgers, salads, french fries, and sodas in a lunch order, display the total order cost, and ask the user if he or she would like to place another order.
 */
package lunchOrder;
import java.util.Scanner;
public class LunchOrder {

	public static void main (String [] args)
	{
		FoodOptions Hamburger = new FoodOptions(1.85, 9.0, 33.0, 1.0);//creates the Hamburger object in the FoodObtions class with the specific values for price, fat, carbs, and fiber
		FoodOptions Salad = new FoodOptions(2.00, 1.0, 11.0, 5.0);//creates the Salad object in the FoodObtions class with the specific values for price, fat, carbs, and fiber
		FoodOptions FrenchFries = new FoodOptions(1.3, 11.0, 36.0, 4.0);//creates the FrenchFries object in the FoodObtions class with the specific values for price, fat, carbs, and fiber
		FoodOptions Soda = new FoodOptions(0.95, 0.0, 38.0, 0.0);//creates the Soda object in the FoodObtions class with the specific values for price, fat, carbs, and fiber
		Scanner input = new Scanner (System.in);
		int choice, hamburgers, salads, frenchFries, sodas;//used by the user to input the number of each ordered food item
		double priceBurgers, priceSalads, priceFrenchFries, priceSodas, orderPrice;//prices of the total number of each food item times its price
		
		do//this do while loop will continue asking for the lunch order as long as the user wants to place another order
		{
			System.out.print("Enter number of hamburgers: ");
			hamburgers=input.nextInt();//user inputs number of burgers in order
			priceBurgers= hamburgers * Hamburger.getPrice();//calculates the total price of the burgers
			System.out.println("Each hamburger has " + Hamburger.getFat() + "g of fat, "
													 + Hamburger.getCarbs() + "g of carbs, and "
												  	 + Hamburger.getFiber() + "g of fiber.\n");
			
			System.out.print("Enter number of salads: ");
			salads=input.nextInt();//user inputs number of salads in order
			priceSalads= salads * Salad.getPrice();//calculates the total price of the salad
			System.out.println("Each salad has " + Salad.getFat() + "g of fat, "
					+ Salad.getCarbs() + "g of carbs, and "
					+ Salad.getFiber() + "g of fiber.\n");
			
			System.out.print("Enter number of fries: ");
			frenchFries=input.nextInt();//user inputs number of fries in order
			priceFrenchFries= frenchFries * FrenchFries.getPrice();//calculates the total price of all the french fires
			System.out.println("French fries have " + FrenchFries.getFat() + "g of fat, "
					+ FrenchFries.getCarbs() + "g of carbs, and "
					+ FrenchFries.getFiber() + "g of fiber.\n");
			
			System.out.print("Enter number of sodas: ");
			sodas=input.nextInt();//user inputs number of sodas in order
			priceSodas= sodas * Soda.getPrice();//calculates the total price of the sodas
			System.out.println("Each soda has " + Soda.getFat() + "g of fat, "
					+ Soda.getCarbs() + "g of carbs, and "
					+ Soda.getFiber() + "g of fiber.\n");
			
			orderPrice= priceBurgers + priceSalads + priceFrenchFries + priceSodas;//calculates the total cost for the order
			System.out.format("%s %4.2f", "Your order comes to: $", orderPrice);
			System.out.println();
			
			System.out.print("Would you like to place another order? 1=Yes 0=No");//asks user if he wants to place another order
			choice= input.nextInt();
			System.out.println();
		}while(choice==1);//returns to the do part of the do while loop if the user responds 1 for yes
		input.close();
	}
	
}
