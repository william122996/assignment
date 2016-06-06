package prg1203.assignment;

import java.math.BigDecimal;
import java.util.Scanner;

public class Book extends Item {
	
	private static final long serialVersionUID = -6381168188394268908L;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublisher;
	private String bookISBN10;
	private String bookISBN13;
	private String bookFiction;
	private Scanner sc = new Scanner(System.in);
	
	public Book() {
		addItem();
	}
	
	// Constructor
	public Book(String itemCode, int itemQuantity, BigDecimal itemCost, 
			BigDecimal itemPrice, boolean itemStatus, int itemDiscount,
			String bookTitle, String bookAuthor, String bookPublisher,
			String bookISBN10, String bookISBN13, String bookFiction) {
		super(itemCode, itemQuantity, itemCost, itemPrice, itemStatus, itemDiscount);
		setBookTitle(bookTitle);
		setBookAuthor(bookAuthor);
		setBookPublisher(bookPublisher);
		setBookISBN10(bookISBN10);
		setBookISBN13(bookISBN13);
		setBookFiction(bookFiction);
	}
	
	public String getBookTitle() {
		return this.bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookAuthor() {
		return this.bookAuthor;
	}
	
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public String getBookPublisher() {
		return this.bookPublisher;
	}
	
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	public String getBookISBN10() {
		return this.bookISBN10;
	}
	
	public void setBookISBN10(String bookISBN10) {
		this.bookISBN10 = bookISBN10;
	}
	
	public String getBookISBN13() {
		return this.bookISBN13;
	}
	
	public void setBookISBN13(String bookISBN13) {
		this.bookISBN13 = bookISBN13;
	}
	
	public String getBookFiction() {
		return this.bookFiction;
	}
	
	public void setBookFiction(String bookFiction) {
		this.bookFiction = bookFiction;
	}
	
	@Override
	public void addItem() {
		super.addItem();
		System.out.println(" Book Title (STRING)");
		this.bookTitle = sc.nextLine();
		System.out.println(" Book Author (STRING)");
		this.bookAuthor = sc.nextLine();
		System.out.println(" Book Publisher (STRING)");
		this.bookPublisher = sc.nextLine();
		System.out.println(" Book ISBN-10 (STRING)");
		this.bookISBN10 = sc.nextLine();
		System.out.println(" Book ISBN-13 (STRING)");
		this.bookISBN13 = sc.nextLine();
		System.out.println(" Book Fiction (STRING)");
		this.bookFiction = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\n\tBook Title:\t" + bookTitle +
				"\n\tBook Author:\t" + bookAuthor +
				"\n\tBook Publisher:\t" + bookPublisher +
				"\n\tISBN-10:\t" + bookISBN10 +
				"\n\tISBN-13:\t" + bookISBN13 +
				"\n\tFiction:\t" + bookFiction;
	}

}
