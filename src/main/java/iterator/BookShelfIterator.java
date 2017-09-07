package iterator;

public class BookShelfIterator implements Iterator {
	BookShelf bookShelf;
	int index = -1;
	Book book;
	
	public boolean hasNext(){
		boolean result = false;
		if(bookShelf.last >= index){
			result = true;
		}
		return result;
	}
	
	public Book next(){
		book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
	
	BookShelfIterator(BookShelf bookShelf){
		this.bookShelf = bookShelf;
		this.index = 0;
	}

}
