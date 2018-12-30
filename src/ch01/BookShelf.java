package ch01;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
//	private Book[] books;
	private ArrayList books;
	
	public BookShelf(int maxSize) {
//		this.books = new Book[maxSize];
		this.books = new ArrayList(maxSize);
	}
	
	public Book getBookAt(int index) {
//		return books[index];
		return (Book)books.get(index);
	}
	
	public void appendBook(Book book) {
//		this.books[last] = book;
		this.books.add(book);
	}
	
	public int getLength() {
		return this.books.size();
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
