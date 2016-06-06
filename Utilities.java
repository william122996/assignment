package prg1203.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utilities {
	
	// Load object
	public static ArrayList<Item> deserialize(String fileName) throws IOException, ClassNotFoundException {
		
		File file = new File(fileName);
		System.out.println(file.getAbsolutePath());
		do {
			file.createNewFile();
		} while (!file.exists());
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		//System.out.println("DeSerialization process has started, displaying objects...");
		
		ArrayList<Item> items = (ArrayList<Item>) ois.readObject();
		//System.out.println(items);
		ois.close();
		//System.out.println("Object DeSerialization completed.");
		return items;
	}
	
	// Save object
	public static void serialize(Object obj, String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//System.out.println("Serialization process has started, displaying objects...");
		oos.writeObject(obj);
		fos.close();
		//System.out.println("Object serialization completed.");
	}
	
	// Column printer
    List<List<String>> lines = new ArrayList<>();
    List<Integer> maxLengths = new ArrayList<>();
    int numColumns = -1;

    public Utilities printLine(String... line) {

        if (numColumns == -1){
            numColumns = line.length;
            for(int i = 0; i < numColumns; i++) {
                maxLengths.add(0);
            }
        }

        if (numColumns != line.length) {
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < numColumns; i++) {
            maxLengths.set(  i, Math.max( maxLengths.get(i), line[i].length() )  );
        }

        lines.add( Arrays.asList(line) );

        return this;
    }

    public void print(){
        System.out.println( toString() );
    }

    public String toString(){
        String result = "";
        for(List<String> line : lines) {
            for(int i = 0; i < numColumns; i++) {
                result += pad( line.get(i), maxLengths.get(i) + 1 );                
            }
            result += System.lineSeparator();
        }
        return result;
    }

    private String pad(String word, int newLength){
        while (word.length() < newLength) {
            word += " ";            
        }       
        return word;
    }
}
