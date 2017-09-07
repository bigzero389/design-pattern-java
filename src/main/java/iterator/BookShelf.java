package iterator;

public class BookShelf implements Aggregate{
	public Book[] books;
	public int last = -1;
	
	public Book getBookAt(int idx){
		return books[idx];
	}
	public void appendBook(Book book){
		last++;
		books[last] = book;
	}
	
	public int getLength(){
		return last;
	}
	
	public Iterator iterator(){
		return new BookShelfIterator(this);
	}
	
	public BookShelf(int maxSize){
		this.books = new Book[maxSize];
	}

}
