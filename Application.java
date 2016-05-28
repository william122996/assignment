package prg1203.assignment;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Popular Bookshop Sdn Bhd Inventory Management");
		
		// Item object array in var itemList
		Item[] itemList = {
				new Book("B001", 10, 19.9, 49.9, true, 15,
						"Harry Potter", "Yoloswaggerino", "New York Storybook", "ABC123", "ABC12345", "Fantasy"),
				new Book("B002", 20, 36.9, 69.9, true, 20,
						"Lord of the Ring", "Martin Lurther King", "USA Book", "ABC123", "ABC12345", "Fantasy"),
				new CD("C001", 10, 19.9, 49.9, true, 15,
						"True", "Blah blah blah", "Avicii", 3, new String[]{"Track A", "Track B", "Track C"}),
				new Staionery("S001", 10, 10, 20, true, 100,
						"Faber Castell", "Mechanical Pen", "FB China", "ABC12345"),
		};
		
		// Display all Book in var books
		for (Item x: itemList) {
			System.out.println(x.toString());
		}
	}

}
