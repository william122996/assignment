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

public class Utilities {
	
	public static boolean checkEmpty(File file) {
		if (file.length() == 0)
			return true;
		else
			return false;
	}
	
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
		items.add(new Book("B001", 200, new BigDecimal("36.9"), new BigDecimal("69.9"), true, 15,
				"Harry Potter Ep. 1", "Yoloswaggerino", "New York Storybook", "NY Book Ltd.", "*this is an address*", "ABC100", "ABC123456", "Fantasy"));
		items.add(new Book("B002", 200, new BigDecimal("36.9"), new BigDecimal("69.9"), true, 20,
				"Harry Potter Ep. 2", "Yoloswaggerino", "New York Storybook", "NY Book Ltd", "*this is an address*", "ABC101", "ABC123457", "Fantasy"));
		items.add(new Book("B003", 200, new BigDecimal("36.9"), new BigDecimal("69.9"), true, 20,
				"Harry Potter Ep. 3", "Yoloswaggerino", "New York Storybook", "NY Book Ltd", "*this is an address*", "ABC102", "ABC123458", "Fantasy"));				
		items.add(new Book("B004", 200, new BigDecimal("36.9"), new BigDecimal("89.9"), true, 20,
				"Lord of the Ring Ep. 1", "Martin Lurther King", "New York Storybook", "NY Book Ltd", "*this is an address*", "ABC123", "ABC123490", "Fantasy / War"));
		items.add(new Book("B005", 200, new BigDecimal("36.9"), new BigDecimal("89.9"), true, 20,
				"Lord of the Ring Ep. 2", "Martin Lurther King", "New York Storybook", "NY Book Ltd", "*this is an address*", "ABC124", "ABC123491", "Fantasy / War"));		
		
		items.add(new CD("C001", 100, new BigDecimal("29.9"), new BigDecimal("89.9"), true, 15,
				"True or Not", "Random songs yo", "Mother of Avicii", "SONY MEDIA LTD", "*this is an address*", 3, new String[]{"Track name A", "Track name B", "Track name C"}));
		items.add(new CD("C002", 100, new BigDecimal("29.9"), new BigDecimal("89.9"), true, 15,
				"Very False", "Random songs yo", "Mother of Avicii", "SONY MEDIA LTD", "*this is an address*", 3, new String[]{"Track name A", "Track name B", "Track name C"}));
		items.add(new CD("C003", 100, new BigDecimal("29.9"), new BigDecimal("89.9"), true, 15,
				"Not Fake Not True", "Random songs yo", "Mother of Avicii", "SONY MEDIA LTD", "*this is an address*", 3, new String[]{"Track name A", "Track name B", "Track name C"}));
		items.add(new CD("C004", 100, new BigDecimal("29.9"), new BigDecimal("89.9"), true, 15,
				"Psuedo-True", "Random songs yo", "Mother of Avicii", "SONY MEDIA LTD", "*this is an address*", 3, new String[]{"Track name A", "Track name B", "Track name C"}));
		items.add(new CD("C005", 100, new BigDecimal("29.9"), new BigDecimal("89.9"), true, 15,
				"Truth", "Random songs yo", "Mother of Avicii", "SONY MEDIA LTD", "*this is an address*", 3, new String[]{"Track name A", "Track name B", "Track name C"}));
		
		items.add(new Stationery("S001", 188, new BigDecimal("3.5"), new BigDecimal("9.9"), true, 0,
				"Faber Castell", "Mechanical Pen", "Faber Castell PRC" , "FB Indonesia Sdn Bhd", "*this is an address*", "BARCODE10001"));
		items.add(new Stationery("S002", 158, new BigDecimal("4.5"), new BigDecimal("19.9"), true, 0,
				"Faber Castell", "Deek Pen", "Faber Castell PRC" , "FB Indonesia Sdn Bhd", "*this is an address*", "BARCODE10002"));
		items.add(new Stationery("S003", 128, new BigDecimal("6.5"), new BigDecimal("29.9"), true, 0,
				"Faber Castell", "Ball Pen", "Faber Castell PRC" , "FB Indonesia Sdn Bhd", "*this is an address*", "BARCODE10003"));
		items.add(new Stationery("S004", 168, new BigDecimal("12.5"), new BigDecimal("39.9"), true, 0,
				"Faber Castell", "Cunning Pen", "Faber Castell PRC" , "FB Indonesia Sdn Bhd", "*this is an address*", "BARCODE10004"));
		items.add(new Stationery("S005", 148, new BigDecimal("88.5"), new BigDecimal("199.9"), true, 0,
				"Faber Castell", "Executive Pen", "Faber Castell PRC" , "FB Indonesia Sdn Bhd", "*this is an address*", "BARCODE10005"));
	}

}
