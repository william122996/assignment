package prg1203.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
        String fileName = new String("");
                
        //If console argument exists it is the default file name until changed.
        if (args.length != 0) {
        	fileName = args[0];
        } else {
        	fileName = "popular.db";
        }
        
        ArrayList<Item> items = new ArrayList<Item>();
        readItem(fileName, items);
		runApp(fileName, items);
	}

	
	public static void runApp(String fileName, ArrayList<Item> items) throws ClassNotFoundException, IOException {	
        
		// ArrayList of Item objects in var items
		
		
		// TODO Add read line from text file
		// Add object into Item object ArrayList in var items
//		items.add(new Book("B001", 10, new BigDecimal("19.9"), new BigDecimal("49.9"), true, 15,
//						"Harry Potter", "Yoloswaggerino", "New York Storybook", "ABC123", "ABC12345", "Fantasy"));
//		items.add(new Book("B002", 20, new BigDecimal("36.9"), new BigDecimal("69.9"), true, 20,
//						"Lord of the Ring", "Martin Lurther King", "USA Book", "ABC123", "ABC12345", "Fantasy"));
//		items.add(new CD("C001", 10, new BigDecimal("19.9"), new BigDecimal("49.9"), true, 15,
//						"True", "Blah blah blah", "Avicii", 3, new String[]{"Track A", "Track B", "Track C"}));
//		items.add(new Stationery("S001", 10, new BigDecimal("10"), new BigDecimal("20"), true, 0,
//						"Faber Castell", "Mechanical Pen", "FB China", "ABC12345"));
		
        
		
		boolean keepAlive = true; // Condition to keep app running
		boolean dbExists = true; // Check if database exists
		int userChoice = 0; // User choice from menu
		
		while(keepAlive) {
			userChoice = showMenu(fileName, dbExists);
			
			switch(userChoice) {
				
				// Add item
				case 1:
				{
					System.out.println(" What is the item type?");
					break;
				}
				
				// Edit item
				case 2:
				{
					break;
				}
				
				// Delete item
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
						System.out.println(" [Item #" + items.indexOf(x) + "]");
						System.out.println(x.toString() + "\n");
					}
					System.out.println(" Press enter to return...");
					System.in.read();
					break;
				}
				
				// Search item
				case 6:
				{
					break;
				}
				
				// Save database
				case 7:
				{
					break;
				}
				
				// Load database
				case 8:
				{
					Scanner fileNameScanner = new Scanner(System.in);
					System.out.println(" Please input database filename: ");
					String fileNameN = fileNameScanner.nextLine();
					File fileNameNew = new File(fileNameN);
					if (!fileNameNew.exists()) {
						fileNameNew.createNewFile();
					}
					readItem(fileNameN, items);
					break;
				}
				
				// Exit
				case 0:
				{
					System.out.println(" Goodbye!");
					keepAlive = false;
					break;
				}
				
				// Fail-safe
				default:
				{
					System.out.println(" You are not supposed to see this.");
				}
					
			}
		}
	}
	
	
	// Main menu
	public static int showMenu(String fileName, boolean dbExists) throws NumberFormatException {
		
		int intChoice  = -1;
		String strChoice = "";
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("  _   _   _               _     _   _   _      __ ___ _   _   _ ");
		System.out.println(" |_) / \\ |_) | | |   /\\  |_)   |_) / \\ / \\ |/ (_   | / \\ |_) |_ ");
		System.out.println(" |   \\_/ |   |_| |_ /--\\ | \\   |_) \\_/ \\_/ |\\ __)  | \\_/ | \\ |_   Inventory Management Software\n");
		System.out.println(" Current Database: " + fileName + "\n");
		System.out.println(" Main Menu");
		
        new Utilities()
        .printLine(" 1) Add an item", "6) Search item")
        .printLine(" 2) Modify item", "7) Save database")
        .printLine(" 3) Delete item", "8) Load database")
        .printLine(" 4) Update item quantity", "-)")
        .printLine(" 5) List all items", "0) Exit")
        .print();
		
		while(intChoice < 0 || intChoice > 8) {
			System.out.println(" Please select a valid option: ");
			strChoice = userInput.next();
			try {
				intChoice = Integer.parseInt(strChoice);
			} catch (NumberFormatException e) {
				intChoice = -1;
			} finally {
				// Code here can run regardless
			}
		}
		
		return intChoice;
	}
	
	
    // Read object from file
	public static void readItem(String fileName, ArrayList<Item> items) throws IOException, ClassNotFoundException{   
		items.clear(); // Remove existing objects in ArrayList items
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        items = (ArrayList<Item>) ois.readObject();
        ois.close();
	}

    // Save object into file
	public void saveItem(String fileName, ArrayList<Item> items) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(items);
        oos.close();
	}
}
