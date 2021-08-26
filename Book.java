package com.training.classes;

import java.io.Serializable;

public class Book  {

	
		private int isbn;
		private String title;
		private int price;
		private double stock;
		public Book(int isbn, String title, int price, double stock) {
			super();
			this.isbn = isbn;
			this.title = title;
			this.price = price;
			this.stock = stock;
		}
		public Book() {
			super();
		}
		public int getIsbn() {
			return isbn;
		}
		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public double getStock() {
			return stock;
		}
		public void setStock(double stock) {
			this.stock = stock;
		}
		
		
		
		

	}


