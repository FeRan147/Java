import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookHT {
	public static void main(String[] args) {
		Scanner inputStr = new Scanner(System.in);
		String choose;
		boolean exitFlag = true;
		while (exitFlag == true) {
			System.out.println(
					"������� 1 ��� ������ ���������� ��� ���� ������\n������� 2 ��� ������ ���� �� ������\n������� 3 ��� ������ ���� �� ������������\n������� 4 ��� ������ ���� ���� �������\n������� 5 ��� ������ �� ���������");
			choose = inputStr.nextLine();
			switch (choose) {
			case "1":
				Library.printBookArray();
				break;
			case "2":
				System.out.println("������� ������:");
				String author = inputStr.nextLine();
				Library.findBookByAuthor(author);
				break;
			case "3":
				System.out.println("������� ������������:");
				String publisher = inputStr.nextLine();
				Library.findBookByPublisher(publisher);
				break;
			case "4":
				System.out.println("������� ���:");
				int year = Integer.parseInt(inputStr.nextLine());
				Library.findBookByYear(year);
				break;
			case "5":
				exitFlag = false;
				break;
			default:
				break;
			}
		}
		inputStr.close();
	}
}

class Book {
	private long id;
	private String title;
	private String author;
	private String publisher;
	private int publicationYear;
	private int pageCount;
	private int price;
	private String bindingType;

	Book() {

	}

	Book(long id, String title, String author, String publisher, int publicationYear, int pageCount, int price,
			String bindingType) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publicationYear = publicationYear;
		this.pageCount = pageCount;
		this.price = price;
		this.bindingType = bindingType;
	}

	public void setId(long newId) {
		this.id = newId;
	}

	public void setTitle(String newTitle) {
		this.title = newTitle;
	}

	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}

	public void setPublisher(String newPublisher) {
		this.publisher = newPublisher;
	}

	public void setPublicationYear(int newPublicationYear) {
		this.publicationYear = newPublicationYear;
	}

	public void setPageCount(int newPageCount) {
		this.pageCount = newPageCount;
	}

	public void setPrice(int newPrice) {
		this.price = newPrice;
	}

	public void setBindingType(String newBindingType) {
		this.bindingType = newBindingType;
	}

	public long getId() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public int getPublicationYear() {
		return this.publicationYear;
	}

	public int getPageCount() {
		return this.pageCount;
	}

	public int getPrice() {
		return this.price;
	}

	public String getBindingType() {
		return this.bindingType;
	}
}

class Library {
	private static ArrayList<Book> booksLibrary;
	private static Book tempBook;

	static {
		booksLibrary = new ArrayList<Book>();
		booksLibrary.add(new Book(1, "�����", "������", "����", 1990, 200, 250000, "�������"));
		booksLibrary.add(new Book(2, "��������", "�������", "���", 2007, 300, 350000, "������"));
		booksLibrary.add(new Book(3, "�����", "���������", "����� ����", 2001, 400, 400000, "�������"));
		booksLibrary.add(new Book(4, "�����", "���������", "�����", 1987, 251, 700000, "�������"));
		booksLibrary.add(new Book(5, "������", "������", "������", 1985, 288, 576000, "������, ������� �������"));
		booksLibrary.add(new Book(6, "����������", "�������", "��� ���", 1952, 315, 231000, "�������"));
		booksLibrary.add(new Book(7, "����������", "���������", "������", 1999, 417, 188000, "�������"));
		booksLibrary.add(new Book(8, "�������", "���������", "�����", 2015, 152, 673000, "�������"));
		booksLibrary
				.add(new Book(9, "������", "��������", "������ �����", 2009, 198, 488000, "�������, ������ �������"));
		booksLibrary.add(new Book(10, "������", "�������", "�������", 2011, 561, 147000, "�������"));
	}

	public static void addNewBook(long id, String title, String author, String publisher, int publicationYear,
			int pageCount, int price, String bindingType) {
		tempBook = new Book();
		tempBook.setId(id);
		tempBook.setTitle(title);
		tempBook.setAuthor(author);
		tempBook.setPublisher(publisher);
		tempBook.setPublicationYear(publicationYear);
		tempBook.setPageCount(pageCount);
		tempBook.setPrice(price);
		tempBook.setBindingType(bindingType);
		booksLibrary.add(tempBook);
	}

	public static void printBookArray() {
		for (Iterator<Book> i = booksLibrary.iterator(); i.hasNext();) {
			Book item = i.next();
			System.out.println(item.getId() + " " + item.getTitle() + " " + item.getAuthor() + " " + item.getPublisher()
					+ " " + item.getPublicationYear() + " " + item.getPageCount() + " " + item.getPrice() + " "
					+ item.getBindingType());
		}
	}

	public static void findBookByAuthor(String author) {
		for (Iterator<Book> i = booksLibrary.iterator(); i.hasNext();) {
			Book item = i.next();
			if (item.getAuthor().equals(author)) {
				System.out.println(item.getId() + " " + item.getTitle() + " " + item.getAuthor() + " "
						+ item.getPublisher() + " " + item.getPublicationYear() + " " + item.getPageCount() + " "
						+ item.getPrice() + " " + item.getBindingType());
			}
		}
	}

	public static void findBookByPublisher(String publisher) {
		for (Iterator<Book> i = booksLibrary.iterator(); i.hasNext();) {
			Book item = i.next();
			if (item.getPublisher().equals(publisher)) {
				System.out.println(item.getId() + " " + item.getTitle() + " " + item.getAuthor() + " "
						+ item.getPublisher() + " " + item.getPublicationYear() + " " + item.getPageCount() + " "
						+ item.getPrice() + " " + item.getBindingType());
			}
		}
	}

	public static void findBookByYear(int year) {
		for (Iterator<Book> i = booksLibrary.iterator(); i.hasNext();) {
			Book item = i.next();
			if (item.getPublicationYear() >= year) {
				System.out.println(item.getId() + " " + item.getTitle() + " " + item.getAuthor() + " "
						+ item.getPublisher() + " " + item.getPublicationYear() + " " + item.getPageCount() + " "
						+ item.getPrice() + " " + item.getBindingType());
			}
		}
	}

}