package prg1203.assignment;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Popular Bookstore Inventory Management");
		
		// List
		ArrayList<Item> items = new ArrayList<Item>();
		
		
		// Item object array in var itemList
		items.add(new Book("B001", 10, 19.9, 49.9, true, 15,
						"Harry Potter", "Yoloswaggerino", "New York Storybook", "ABC123", "ABC12345", "Fantasy"));
		items.add(new Book("B002", 20, 36.9, 69.9, true, 20,
						"Lord of the Ring", "Martin Lurther King", "USA Book", "ABC123", "ABC12345", "Fantasy"));
		items.add(new CD("C001", 10, 19.9, 49.9, true, 15,
						"True", "Blah blah blah", "Avicii", 3, new String[]{"Track A", "Track B", "Track C"}));
		items.add(new Stationery("S001", 10, 10, 20, true, 0,
						"Faber Castell", "Mechanical Pen", "FB China", "ABC12345"));
		
		// Testing explicit casting
		
		
		// Display all Book in var books
		for (Item x: items) {
			System.out.println("[Item #" + items.indexOf(x) + "]");
			System.out.println(x.toString() + "\n");
		}
	}

}
