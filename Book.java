package prg1203.assignment;

import java.math.BigDecimal;
import java.util.Scanner;

public class Book extends Item {
	
	private static final long serialVersionUID = -6381168188394268908L;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublisher;
	private String bookPublisherCompany;
	private String bookPublisherAddress;
	private String bookISBN10;
	private String bookISBN13;
	private String bookFiction;
	private transient Scanner sc = new Scanner(System.in);
	
	public Book() {
		addItem();
	}
	
	// Constructor
	public Book(String itemCode, int itemQuantity, BigDecimal itemCost, 
			BigDecimal itemPrice, boolean itemStatus, int itemDiscount,
			String bookTitle, String bookAuthor, String bookPublisher,
			String bookPublisherCompany, String bookPublisherAddress,
			String bookISBN10, String bookISBN13, String bookFiction) {
		super(itemCode, itemQuantity, itemCost, itemPrice, itemStatus, itemDiscount);
		setBookTitle(bookTitle);
		setBookAuthor(bookAuthor);
		setBookPublisher(bookPublisher);
		setBookISBN10(bookISBN10);
		setBookISBN13(bookISBN13);
		setBookFiction(bookFiction);
	}
	
	private String getBookTitle() {
		return this.bookTitle;
	}
	
	private void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	private String getBookAuthor() {
		return this.bookAuthor;
	}
	
	private void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	private String getBookPublisher() {
		return this.bookPublisher;
	}
	
	private void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	private String getBookPublisherCompany() {
		return this.bookPublisherCompany;
	}
	
	private void setBookPublisherCompany(String bookPublisherCompany) {
		this.bookPublisherCompany = bookPublisherCompany;
	}
	
	private String getBookPublisherAddress() {
		return this.bookPublisherAddress;
	}
	
	private void setBookPublisherAddress(String bookPublisherAddress) {
		this.bookPublisherAddress = bookPublisherAddress;
	}
	
	private String getBookISBN10() {
		return this.bookISBN10;
	}
	
	private void setBookISBN10(String bookISBN10) {
		this.bookISBN10 = bookISBN10;
	}
	
	private String getBookISBN13() {
		return this.bookISBN13;
	}
	
	private void setBookISBN13(String bookISBN13) {
		this.bookISBN13 = bookISBN13;
	}
	
	private String getBookFiction() {
		return this.bookFiction;
	}
	
	private void setBookFiction(String bookFiction) {
		this.bookFiction = bookFiction;
	}
	
	@Override
	public void addItem() {
		super.addItem();
		System.out.println("[Book Title] (str)");
		setBookTitle(sc.nextLine());
		System.out.println("[Book Author] (str)");
		setBookAuthor(sc.nextLine());
		System.out.println("[Book Publisher] (str)");
		setBookPublisher(sc.nextLine());
		System.out.println("[Book Publisher Company Name] (str)");
		setBookPublisherCompany(sc.nextLine());
		System.out.println("[Book Publisher Company Address] (str)");
		setBookPublisherAddress(sc.nextLine());
		System.out.println("[Book ISBN-10] (str)");
		setBookISBN10(sc.nextLine());
		System.out.println("[Book ISBN-13] (str)");
		setBookISBN13(sc.nextLine());
		System.out.println("[Book Fiction] (strgetItemCode()");
		setBookFiction(sc.nextLine());
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\n[Book Title]\t" + getBookTitle() +
				"\n[Book Author]\t" + getBookAuthor() +
				"\n[Book Publisher]\t" + getBookPublisher() +
				"\n[Book Publisher Company Name]\t" + getBookPublisherCompany() +
				"\n[Book Publisher Company Address]\t" + getBookPublisherAddress() +
				"\n[Book ISBN-10]\t" + getBookISBN10() +
				"\n[Book ISBN-13]\t" + getBookISBN13() +
				"\n[Book Fiction]\t" + getBookFiction();
	}

}
