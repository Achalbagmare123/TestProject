package com.starlite.model;

import java.util.Objects;

public class Book {
private int bookId;
private String bookName;
private String authorName;
private String publisher;

public Book() {
	super();
	// TODO Auto-generated constructor stub
}

public Book(int bookId, String bookName, String authorName, String publisher) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.authorName = authorName;
	this.publisher = publisher;
	
}

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getAuthorName() {
	return authorName;
}

public void setAuthorName(String authorName) {
	this.authorName = authorName;
}

public String getPublisher() {
	return publisher;
}

public void setPublisher(String publisher) {
	this.publisher = publisher;
}





@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", publisher="
			+ publisher + "]";
}

@Override
public int hashCode() {
	return Objects.hash(authorName, bookId, bookName, publisher);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	return Objects.equals(authorName, other.authorName) && bookId == other.bookId
			&& Objects.equals(bookName, other.bookName) && Objects.equals(publisher, other.publisher);
			
}


}

