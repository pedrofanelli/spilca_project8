package model;

public class Comment {
	private String author;
	private String text;
	
	public Comment(String author, String text) {
		this.author = author;
		this.text = text;
	}
	
	public String getAuthor() {
		return this.author;
	}
	public String getText() {
		return this.text;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setText(String text) {
		this.text = text;
	}
}
