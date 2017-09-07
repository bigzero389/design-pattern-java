package iterator;

public class IteratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf bookShelf = new BookShelf(10);
		Iterator it = new BookShelfIterator(bookShelf);
		int bookIdx = 1;
		Book book;

		for(int i=0, j=10 ; i<j ; i++){
			book = new Book(String.valueOf(bookIdx)+"±Ç");
			bookShelf.appendBook(book);
			bookIdx++;
		}
		
		while(it.hasNext()){
			book = (Book)it.next();
			System.out.println(book.getName());
		}

	}

}
