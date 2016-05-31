package prg1203.assignment;

import java.util.ArrayList;
import java.util.Scanner;

/*
PRG1203 Coursework April 2016
Object-oriented Programming Fundamentals (PRG1203)
Faculty of Science and Technology
Sunway University, Malaysia

1) TAN HAOLUN		15073141
2) WILLIAM			14043061
3) ONG HUEY WEN		14040844
4) WONG KAH SIAK	15056013
*/

public class Application {

	public static void main(String[] args) {
		
		// ArrayList of Item objects in var items
		ArrayList<Item> items = new ArrayList<Item>();
		
		// TODO Add read line from text file
		// Add object into Item object ArrayList in var items
		items.add(new Book("B001", 10, 19.9, 49.9, true, 15,
						"Harry Potter", "Yoloswaggerino", "New York Storybook", "ABC123", "ABC12345", "Fantasy"));
		items.add(new Book("B002", 20, 36.9, 69.9, true, 20,
						"Lord of the Ring", "Martin Lurther King", "USA Book", "ABC123", "ABC12345", "Fantasy"));
		items.add(new CD("C001", 10, 19.9, 49.9, true, 15,
						"True", "Blah blah blah", "Avicii", 3, new String[]{"Track A", "Track B", "Track C"}));
		items.add(new Stationery("S001", 10, 10, 20, true, 0,
						"Faber Castell", "Mechanical Pen", "FB China", "ABC12345"));
		
        String fileName = new String("");
        
        //If console argument exists it is the default file name until
        //changed.
        if (args.length != 0) {
        	fileName = args[0];
        } else {
        	fileName = "none";
        }
        
		runApp(fileName, items);
	}
	
	public static void runApp(String fileName, ArrayList<Item> items) {
		
		boolean keepAlive = true; // Condition to keep app running
		boolean dbExists = true; // Check if database exists
		int userChoice = 0; // User choice from menu
		
		while(keepAlive) {
			userChoice = showMenu(fileName, dbExists);
			
			switch(userChoice) {
				// Add an item
				case 1:
				{
					System.out.println("");
					
					break;
				}
				
				// Edit an item
				case 2:
				{
					break;
				}
				
				// Delete an item
				case 3:
				{
					break;
				}
				
				// Update item quantity
				case 4:
				{
					break;
				}
				
				// List all items
				case 5:
				{
					// Display all Item in ArrayList var items
					for (Item x: items) {
						System.out.println("[Item #" + items.indexOf(x) + "]");
						System.out.println(x.toString() + "\n");
					}
					break;
				}
				
				// Search for an item
				case 6:
				{
					break;
				}
				
				// Import database
				case 7:
				{
					break;
				}
				
				// Export database
				case 8:
				{
					break;
				}
				
				// Exit
				case 9:
				{
					System.out.println("Goodbye!");
					keepAlive = false;
					break;
				}
				
				// Fail-safe
				default:
				{
					System.out.println("You are not supposed to see this.");
				}
					
			}
		}
	}
	
	public static int showMenu(String fileName, boolean dbExists) throws NumberFormatException {
		
		int intChoice  = 0;
		String strChoice = "";
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Popular Bookstore Inventory Management");
		System.out.println("Select an option:");
		System.out.println("1) Add an item");
		System.out.println("2) Edit an item");
		System.out.println("3) Delete an item");
		System.out.println("4) Update item quantity");
		System.out.println("5) List all item");
		System.out.println("6) Search");
		if (dbExists) {
			System.out.println("7) Import database");
			System.out.println("8) Export database");
		}
		System.out.println("9) Exit\n");
		
		while(intChoice < 1 || intChoice > 9) {
			System.out.println("Please select a valid option: ");
			strChoice = userInput.next();
			try {
				intChoice = Integer.parseInt(strChoice);
			} catch (NumberFormatException e) {
				intChoice = -1;
			} finally {
				// TODO Close scanner resource, or not
				userInput.close();
				//System.out.println("Final can execute code regardless!");
			}
		}
		
		return intChoice;
	}

}
