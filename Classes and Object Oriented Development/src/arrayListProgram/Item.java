/*Andrew Orlosky
 *Mr. Cramer
 *Java G.T  P.4A
 *3/21/18
 *Item.java
 *Object Class
 *This code will help the client code by returning the values of the item name, stock number, and amount of that item. It will also change the value of any of these listed in the client code, and the item object can check the name given by the user with a specific item's name to discontinue it or display its amount.
 */
package arrayListProgram;
public class Item {

    private String itemName;//creates string for an item's name
    private int stockNumber;//creates the variable for the stock number
    private int amount;//creates the variable for the amount of an item in the inventory
    public Item(String in, int sn, int amt)//constructor method for the option 1 that passes the item's name, stock number, amount of the item from the client code
    {
   	 itemName=in;//initializes string for an item's name
   	 stockNumber=sn;//creates the variable for the stock number
   	 amount=amt;//creates the variable for the item's amount in stock
    }
    public Item(String in)//constructor method where only the item's name is passes (option 2 or 3)
    {
   	 itemName=in;
    }
    public String getItemName()//returns the item name
    {
   	 return(itemName);
    }
    public void changeItemName(String tempItemName)//changes the item name to that passed from the client code, which was discontinued in the client code
    {
   	 itemName=tempItemName;
    }
    public int getStockNumber()//returns the stock number for the item
    {
   	 return(stockNumber);
    }
    public int getAmount()//returns the amount of the item added to the inventory by the user
    {
   	 return(amount);
    }
    public void changeAmount(int tempItemNumber)//changes the amount to that inputed by the user, which was 0 in the client code
    {
   	 amount=tempItemNumber;
    }
    public boolean equals(Object tempItem) { //compares the name of the item in the inventory to the name entered by the user to make sure that they are the same before changing the amount or the name in the client code
   	 Item checkItemName = (Item)tempItem;//assigns the name of the temporary item to the check the item name variable
   	 
   	 if (itemName.equals(checkItemName.itemName)) {//checks if the name of the user entered item name is equal to the one in the inventory
   		 return (true);
   	 }
   	 else {//returns false if it is not equal to that name in the inventory
   		 return(false);
   	 }
    }
}

