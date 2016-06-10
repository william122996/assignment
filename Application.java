package prg1203.assignment;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

// ===== PRG1203 OBJECT-ORIENTED PROGRAMMING FUNDAMENTALS ======
// = Group Assignment April 2016
// = Faculty of Science and Technology
// = Sunway University, Malaysia
// =
// ===== CONTRIBUTORS ==========================================
// = 1) TAN HAOLUN		15073141
// = 2) WILLIAM			14043061
// = 3) ONG HUEY WEN	14040844
// = 4) WONG KAH SIAK	15056013
// =
// ===== VERSION HISTORY =======================================
// = Version 1.2
// = * Added Java file I/O
// = * Moved addItem() into their respective classes
// = * Replaced double with BigDecimal for currency fields
// = 
// = Version 1.1
// = * Added searchItem() method
// = * Updated to be more modular, loop until user exits
// =
// = Version 1.0
// = * Initial release
// = 
// =============================================================

public class Application {

	// Main method
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		String fileName = new String("");
		
		if (args.length != 0) {
			fileName = args[0];
		} else {
			fileName = "popular.db"; // Default database name, please place under project root
		}
		
		runApplication(fileName);
	}
	
	
	// User program logic
	public static void runApplication(String fileName) throws ClassNotFoundException, IOException {
		
		File file = new File(fileName);	
		ArrayList<Item> items = new ArrayList<Item>();
		
		items = Utilities.deserialize(items, file, fileName);
		
		boolean keepAlive = true; // Keep console running
		int userChoice = 0;
		Scanner sc = new Scanner(System.in);
		
		while(keepAlive) {
			userChoice = showMenu(fileName);
			
			switch(userChoice) {
			case 1: // Add item
			{
				System.out.println("What is the item type?");
				System.out.println("1) Book");
				System.out.println("2) CD");
				System.out.println("3) Stationery");
				System.out.println("4) Cancel");
				switch(sc.nextInt()) {
				case 1:
				{
					items.add(new Book());
					break;
				}
				case 2:
				{
					items.add(new CD());
					break;
				}
				case 3:
				{
					items.add(new Stationery());
					break;
				}
				}
				Utilities.serialize(items, fileName);
				System.out.println("Item saved successfully.");
				break;
			}
			
			case 2: // Edit item
			{
				System.out.println("Search Query [Item Code]: ");
				Item result = Item.searchItem(items, sc.nextLine());
				if (result != null) {
					int i = items.indexOf(result);
					System.out.println("Item found! Answer 'yes' to confirm edit.");
					if (sc.nextLine().equalsIgnoreCase("yes")) {
						items.get(i).editItem();
						break;
					}
				}
				System.out.println("Returning...");
				break;
			}
			
			case 3: // Delete item
			{
				System.out.println("Search Query [Item Code]: ");
				Item result = Item.searchItem(items, sc.nextLine());
				if (result != null) {
					int i = items.indexOf(result);
					System.out.println("Item found! Answer 'yes' to confirm delete.");
					if (sc.nextLine().equalsIgnoreCase("yes")) {
						items.remove(i);
						System.out.println("Item removed successfully! Returning...");
						break;
					}
				}
				System.out.println("Returning...");
				break;
			}
			
			case 4: // Update item quantity
			{
				System.out.println("Search Query [Item Code]: ");
				Item result = Item.searchItem(items, sc.nextLine());
				if (result != null) {
					int i = items.indexOf(result);
					System.out.println("Item found!");
					System.out.println(items.get(i).toString());
					System.out.println("Enter new amount: ");
					int quantity = sc.nextInt();
					if (quantity > 0) {
						items.get(i).updateItemQuantity(quantity);
						break;
					} else {
						System.out.println("Only natural integers are allowed!");
					}
				}
				System.out.println("Returning...");
				break;
			}
			
			case 5: // List all items
			{
				System.out.println("Listing all items...");
				for (Item x: items) {
					System.out.println(x.toString() + "\n");
				}
				break;
			}
			
			case 6: // Search item
			{
				System.out.println("Search Query [Item Code]: ");
				Item result = Item.searchItem(items, sc.nextLine());
				if (result != null) {
					System.out.println("Item found!");
					System.out.println(result.toString() + "\n");
				} else {
					System.out.println("Item not found! Returning...");
				}
				break;
			}
			
			case 7: // Save database
			{
				try {
					Utilities.serialize(items, fileName);
					break;
				} catch (ClassNotFoundException | IOException ex) {
					ex.printStackTrace();
				}
				break;
			}
			
			case 8: // Load database
			{
				try {
					items = Utilities.deserialize(items, file, fileName);
					break;
				} catch (ClassNotFoundException | IOException ex) {
					ex.printStackTrace();
				}
				break;
			}

			// Load dummy data, only if attached popular.db is unserializable
			case 9: // Clear ArrayList and load dummy data
			{
				items.clear();
				System.out.println("ArrayList is now empty.");
				Utilities.loadDummy(items);
				break;
			}
			
			case 0: // Exit
			{
				System.out.println("Are you sure to exit program? Answer 'yes' to confirm.");
				if (sc.nextLine().equalsIgnoreCase("yes")) {
					System.out.println("Good bye!");
					keepAlive = false;
				}
				break;
			}
			
			default: // Fail safe
				System.out.println("You are not supposed to see this. Please contact system administrator.");
				break;
			}
		}
	}
	
	
	// Main menu display
	public static int showMenu(String fileName) throws NumberFormatException {
		
		int intChoice  = -1;
		String strChoice = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Popular Bookshop Inventory Management System\n");
		System.out.println("Main Menu:");
		System.out.println("1) Add an item");
		System.out.println("2) Modify item");
		System.out.println("3) Delete item");
		System.out.println("4) Update item quantity");
		System.out.println("5) List all items");
		System.out.println("6) Search item");
		System.out.println("7) Save database");
		System.out.println("8) Load database");
		System.out.println("0) Exit\n");
		
		while(intChoice < 0 || intChoice > 9) {
			System.out.println("User Input >");
			strChoice = sc.next();
			try {
				intChoice = Integer.parseInt(strChoice);
			} catch (NumberFormatException e) {
				intChoice = -1;
			}
		}
		return intChoice;
	}

}