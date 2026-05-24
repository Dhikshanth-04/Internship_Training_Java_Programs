import java.util.*;

class SortingId implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		Integer id1 = o1.getBookId();
		Integer id2 = o2.getBookId();
		return id2.compareTo(id1);
	}
	
}

class SortingPrice implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		Double price1 = o1.getBookPrice();
		Double price2 = o2.getBookPrice();
		return price1.compareTo(price2);
	}
	
}

class SortingName implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		String bookName1 = o1.getBookName();
		String bookName2 = o2.getBookName();
		if(bookName1.equalsIgnoreCase(bookName2)) {
			Integer id1 = o1.getBookId();
			Integer id2 = o2.getBookId();
			return id1.compareTo(id2);
		}
		return bookName1.compareTo(bookName2);
	}
	
}

class Book{
	private int bookId;
	private String bookName;
	private double bookPrice;
	public Book(int bookId, String bookName, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
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
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
}

public class Comparator_Java{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SortingId sid = new SortingId();
		SortingName snm = new SortingName();
		SortingPrice sp = new SortingPrice();
		TreeSet<Book> ts = new TreeSet<Book>(snm);
		System.out.println("Enter number of books : ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			System.out.println("Enter book details");
			String str = sc.nextLine();
			String[] data = str.split(",");
			Book b = new Book(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]));
			ts.add(b);
		}
		System.out.println(ts);
	}
}