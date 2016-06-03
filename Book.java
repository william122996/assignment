package prg1203.assignment;

import java.io.Serializable;
import java.math.BigDecimal;

public class Book extends Item implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6257639711549272203L;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublisher;
	private String bookISBN10;
	private String bookISBN13;
	private String bookFiction;
	
	public Book() {
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
	public String toString() {
		return super.toString() +
				"\nBook Title:\t" + bookTitle +
				"\nBook Author:\t" + bookAuthor +
				"\nBook Publisher:\t" + bookPublisher +
				"\nISBN-10:\t" + bookISBN10 +
				"\nISBN-13:\t" + bookISBN13 +
				"\nFiction:\t" + bookFiction;
	}

}
