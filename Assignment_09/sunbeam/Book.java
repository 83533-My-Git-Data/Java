package com.sunbeam;


class Book {
	private String isbn;
	private Category c;
	private double price;
	private String authorName;
	private int quantity;

	
	public Book() {
		super();
	}

	public Book(String isbn, int ch, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		c = Category.values()[ch];
		this.c = c;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	
	}

	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public Category getC() {
		return c;
	}


	public void setC(Category c) {
		this.c = c;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Book [isbn ="  + isbn +  " category ="  + c + " Price ="  + price +  " Name ="  + authorName +  " Quantity ="
				+ quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}
	

}
