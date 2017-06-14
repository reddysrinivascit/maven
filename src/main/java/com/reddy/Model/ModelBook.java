package com.reddy.Model;

	import java.time.LocalDate;

	public class ModelBook {
		private int isbn;
		private String title;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		private String author;
		private LocalDate publishdate;
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		private String content;
		private int price;
		private String status;
		public int getIsbn() {
			return isbn;
		}
		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}

	public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public LocalDate getPublishdate() {
			return publishdate;
		}
		public void setPublishdate(LocalDate publishdate) {
			this.publishdate = publishdate;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		
		}

	}


