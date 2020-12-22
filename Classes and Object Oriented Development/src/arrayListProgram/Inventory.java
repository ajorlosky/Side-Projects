/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *3/21/18
 *Inventory.java
 *Client Code
 *This code will manage a sports store inventory, asking the user if he or she would like to add an item, discontinue an item, display the amount of an item, or quit managing the inventory.
 */
package arrayListProgram;
import java.util.ArrayList;//imports ArrayList
import java.util.Scanner;//imports user Scanner
public class Inventory {

    public static void main (String [] args)
    {
   	 Scanner input = new Scanner (System.in);
   	 ArrayList<Item> sportsStoreInventory = new ArrayList<Item>();//creates array list of item objects called sportsStoreInventory
   	 int addItem, userChoice, tempItemNumber, i;//creates integer variables to allow the user to add another item, choose option on managing inventory, create amount of an item, and use i to access the indexOf object
   	 int stockNumber=1000;//initializes the stock number of the first item as 1000
   	 Item tempItem;//creates object for an item in the inventory
   	 String tempItemName;//creates string for an item name
   	 System.out.print("Sports Store Inventory: \n");//prints the sports store inventory to the user
   	 do
   	 {
   		 System.out.print("\nChoose what you would like to do with the sports store inventory:\n"//user chooses if he or she wants to add items, discontinue items, show the amount of an item, or quit adding items.
   				 + " 1=Add an item \n "//adds an item
   				 + "2=Discontinue an item \n "//discontinues item from inventory
   		  		 + "3=Display the amount of stock for an item \n"//displays the amount of an item in stock
   		  		 + " 4=Quit \n");//quits inventory
   		 userChoice=input.nextInt();
   		 if(!(userChoice<4 || userChoice>1))//checks the users input and if it is not between 1 and 4 it will ask for the user to hoose again
   		 {
   			 System.out.println("You did not enter a valid option. Please choose again.\n” + “Choose what you would like to do with the sports store inventory:\n"
   				 + "1=Add an item \n "
   				 + "2=Discontinue an item \n "
   		  		 + "3=Display the amount of stock for an item \n"
   		  		 + "4=Quit \n");
   			 userChoice=input.nextInt();
   		 }
   		 if(userChoice==1)//adds an item to the inventory
   		 {
   			 
   			 System.out.print("Enter the item name to be added: ");//user inputs the name of the item
   			 tempItemName=input.next();
   			 tempItemName=tempItemName.toLowerCase();//item name is changed to all lower case letters
   			 System.out.print("How many of this item would you like to add?");//user inputs the amount of an item to add to the inventory
   			 tempItemNumber=input.nextInt();
   			 tempItem= new Item(tempItemName, stockNumber, tempItemNumber);//creates the temporary item and gives these value to the object using a constructor method
   			 sportsStoreInventory.add(tempItem);//adds the item to the arrayList
   			 System.out.print("\nItem Information:\n" //prints the item information to the user
   					 + "Item Name: " + tempItem.getItemName() + "\n"//prints the name of the item
   					 + "Item Account Number: " + tempItem.getStockNumber() + "\n"//prints the stock number for the item
   					 + "Item Amount: " + tempItem.getAmount() + "\n");//prints the amount of an item in the inventory
   		 }
   		 if(userChoice==2)//discontinues an item from the inventory
   		 {
   			 System.out.print("Enter the item name to be discontinued: ");//user enters the specific name of the item he or she wishes to discontinue
   			 tempItemName=input.next();
   			 tempItemName=tempItemName.toLowerCase();//the name of the user entered item name is changed to all lower case
   			 tempItem= new Item(tempItemName);//creates the temporary item while giving the item's name to the object via the constructor method   			 
   			 i=sportsStoreInventory.indexOf(tempItem);//assigns the .indexOf that compares the name of item to the item in the inventory to the variable i
   			 tempItemName= "discontinued.";//changes the item's name to discontinued
   			 tempItemNumber=0;//changes the amount of the item to 0
   			 sportsStoreInventory.get(i).changeItemName(tempItemName);//uses the .indexOf to change the item name in inventory to discontinued if it is the same as the one entered by the user
   			 sportsStoreInventory.get(i).changeAmount(tempItemNumber);//changes the amount of the item in inventory to the 0 if it is the same as the name the user entered
   			 System.out.print("\nItem Information:\n"//prints the item information to the user
   					 + "Item Name: " + sportsStoreInventory.get(i).getItemName() + "\n"//prints the name of the item, which is discontinued if the user responds correctly
   					 + "Item Amount: " + sportsStoreInventory.get(i).getAmount() + "\n"//prints the amount of the item, which is probably 0
   					 + "This item was successfully discontinued from the sports store inventory. \n");//informs the user that the item was discontinued
   		 }
   		 if(userChoice==3)//displays the amount of an item to the user
   		 {
   			 System.out.print("Enter the item name to display its amount: ");//user enters the name of the desired item
   			 tempItemName=input.next();
   			 tempItemName = tempItemName.toLowerCase();//item name is changed to all lower case
   			 tempItem= new Item(tempItemName);//temporary item is created, passing the name to the constructor
   			 i=sportsStoreInventory.indexOf(tempItem);//assigns the .indexOf that compares the name of item to the item in the inventory to the variable i
   			 System.out.print("\nItem Amount: " //prints the amount
   					 + sportsStoreInventory.get(i).getAmount() + "\n");//obtains the amount of that item from the object if the user inputed name and the item name are the same
   		 }
   		 System.out.print("\nWould you like to continue updating the inventory? (1=YES AND 0=NO) :");//user decides if he or she would like to add another item to the inventory
   		 addItem= input.nextInt();
   		 stockNumber+=1;//adds one to the value of the stock number
   	 }while(addItem==1);//continues managing the inventory if the user chooses to

   	 System.out.println("Thank you for updating the inventory. Have a nice day.");
   	 input.close();
    }
}
