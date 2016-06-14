package prg1203.assignment;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Utilities {
	
	// Check if File empty
//	public static boolean checkEmpty(File file) {
//		if (file.length() == 0)
//			return true;
//		else
//			return false;
//	}

	
	// Load object from file
	public static ArrayList<Item> deserialize(ArrayList<Item> items, File file, String fileName) throws ClassNotFoundException, EOFException, IOException {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("New database file created. File name: " + fileName);
			Utilities.loadDummy(items);
			serialize(items, fileName);
		}
		
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			System.out.println("Reading database from \"" + file.getAbsolutePath() + "\"");
			items = (ArrayList<Item>) ois.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			ois.close();
			System.out.println("Database reading completed! Returning...\n");
		}
		return items;
	}
	
	
	// Write object to file
	public static void serialize(ArrayList<Item> items, String fileName) throws ClassNotFoundException, IOException {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			System.out.println("Engaging database serialization...");
			oos.writeObject(items);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			fos.close();
			System.out.println("Database serialization completed! Returning...\n");
		}
	}
	
	// Extra dummy data block
	public static void loadDummy(ArrayList<Item> items) {
		System.out.println("Loading dummy data...");
		items.add(new Book("B001", 200, new BigDecimal("36.9"), new BigDecimal("69.9"), true, 5,
				"The Lord of The Rings", "J. R. R. Tolkien", "HarperCollins", "HarperCollins Publishers LLC",
				"New York City, New York, United States", "0261103253", "978-0261103252", "Fantasy / Novel"));
		items.add(new Book("B002", 200, new BigDecimal("36.9"), new BigDecimal("74.9"), true, 5,
				"The Hobbit", "J. R. R. Tolkien", "HarperCollins", "HarperCollins Publishers LLC",
				"New York City, New York, United States", "0007458428", "978-0007458424", "Fantasy / Novel"));
		items.add(new Book("B003", 200, new BigDecimal("36.9"), new BigDecimal("69.9"), true, 5,
				"Harry Potter and the Cursed Child", "J. K. Rowling", "Little, Brown", "Little, Brown and Company",
				"Boston, Massachusetts, United States", "0751565350", "978-0751565355", "Science Fiction / Fantasy"));				
		items.add(new Book("B004", 200, new BigDecimal("36.9"), new BigDecimal("69.9"), true, 5,
				"Harry Potter and the Chamber of Secrets", "J. K. Rowling", "Little, Brown", "Little, Brown and Company",
				"Boston, Massachusetts, United States", "1408855666", "978-1408855669", "Science Fiction / Fantasy"));	
		items.add(new Book("B005", 200, new BigDecimal("36.9"), new BigDecimal("69.9"), true, 5,
				"Harry Potter and the Prisoner of Azkaban", "J. K. Rowling", "Little, Brown", "Little, Brown and Company",
				"Boston, Massachusetts, United States", "1408855674", "978-1408855676", "Science Fiction / Fantasy"));	
		
		items.add(new CD("C001", 280, new BigDecimal("29.9"), new BigDecimal("89.9"), true, 15,
				"Thriller", "Thriller is the sixth album by American singer Micheal Jackson.", 
				"Micheal Jackson", "Westlake Recording Studios", "Los Angeles, California", 9,
				new ArrayList<String>(Arrays.asList("Wanna Be Startin' Something", "Baby Be Mine", "This Girl is Mine", "Thriller", 
						"Beat It", "Billie Jean", "Human Nature", "P.Y.T.", "The Lady in My Life"))));
		items.add(new CD("C002", 350, new BigDecimal("29.9"), new BigDecimal("89.9"), true, 15,
				"Back in Black", "Back in Black is the seventh studio album by Australian rock band AC/DC.",
				"AC/DC", "Compass Point Studios", "Nassau, Bahamas", 10,
				new ArrayList<String>(Arrays.asList("Hells Bells", "Shoot to Thrill", "What Do You Do for Money Honey",
						"Given the Dog a Bone", "Let Me Put My Love into You", "Back in Black", "You Shoot Me All Night Long",
						"Have a Drink on Me", "Shake a Leg", "Rock and Roll Ain't Noise Pollution"))));
		items.add(new CD("C003", 640, new BigDecimal("29.9"), new BigDecimal("89.9"), true, 15,
				"The Dark Side of The Moon", "Dark Side of The Moon is the eighth studio album by the English progressive rock band Pink Floyd.", 
				"Pink Floyd", "Abbey Road Studios", "City of Westminster, London, England", 10,
				new ArrayList<String>(Arrays.asList("Speak to Me", "Breathe", "On the Run", "Time", "The Great Gig in the Sky", 
						"Money", "Us and Them", "Any Colour You Like", "Brain Damage", "Eclipse"))));
		items.add(new CD("C004", 230, new BigDecimal("29.9"), new BigDecimal("89.9"), true, 10,
				"The Bodyguard: Original Soundtrack Album", "The Bodyguard: Original Soundtrack Album is the soundtrack from the film of the same name, released on November 17, 1992, by Arista Records.",
				"Whitney Houston", "Arista, Sony Music Entertainment", "United States", 13, 
				new ArrayList<String>(Arrays.asList("I Will Always Love You", "I Have Nothing", "I'm Every Woman", "Run to You", "Queen of the Night",
						"Jesus Loves Me", "Even If My Heart Would Break", "Someday (I'm Coming Back)", "It's Gonna Be a Lovely Day", "Peace, Love, Understanding",
						"Waiting for You", "Trust in Me", "Theme from The Bodyguard"))));
		items.add(new CD("C005", 180, new BigDecimal("29.9"), new BigDecimal("89.9"), true, 5,
				"The Golden Age", "The Golden Age is the debut studio album from French singer-songwriter and director Woodkid.",
				"Woodkid", "Green United Music", "68 Rue René Boulanger, 75010 Paris, France", 14,
				new ArrayList<String>(Arrays.asList("The Golden Age", "Run Boy Run", "The Great Escape", "Boat Song", "I Love You", "The Shore",
						"Ghost Lights", "Shadows", "Stabat Mater", "Conquest of Spaces", "Failing", "Where I Live", "Iron", "The Other Side"))));
		
		items.add(new Stationery("S001", 188, new BigDecimal("3.5"), new BigDecimal("9.9"), true, 0,
				"Faber-Castell", "Medium Ballpoint Refill Pen", "Faber-Castell" , "A.W. Faber-Castell (Aust.) PTY LTD",
				"15 Gibbon Road, Winston Hills NSW 2153, Australia", "4190092523"));
		items.add(new Stationery("S002", 158, new BigDecimal("4.5"), new BigDecimal("19.9"), true, 0,
				"Faber-Castell", "Black Lead Pencil", "Faber-Castell" , "A.W. Faber-Castell (Aust.) PTY LTD",
				"15 Gibbon Road, Winston Hills NSW 2153, Australia", "5703515247"));
		items.add(new Stationery("S003", 128, new BigDecimal("6.5"), new BigDecimal("29.9"), true, 0,
				"Faber-Castell", "Coloured Pencils", "Faber-Castell" , "A.W. Faber-Castell (Aust.) PTY LTD",
				"15 Gibbon Road, Winston Hills NSW 2153, Australia", "0188419634"));
		items.add(new Stationery("S004", 168, new BigDecimal("12.5"), new BigDecimal("39.9"), true, 0,
				"Faber-Castell", "Fountain Pens", "Faber-Castell" , "A.W. Faber-Castell (Aust.) PTY LTD",
				"15 Gibbon Road, Winston Hills NSW 2153, Australia", "7712793299"));
		items.add(new Stationery("S005", 148, new BigDecimal("88.5"), new BigDecimal("199.9"), true, 0,
				"Faber-Castell", "Charcoal Pen", "Faber-Castell" , "A.W. Faber-Castell (Aust.) PTY LTD",
				"15 Gibbon Road, Winston Hills NSW 2153, Australia", "0490096354"));
	}

}
