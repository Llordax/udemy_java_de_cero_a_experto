package client;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.Chapter;
import model.Publisher;
import service.BookStoreService;

public class BookStoreClient {
	
	public static void main(String[] args) {
		BookStoreService bookStoreService = new BookStoreService();
		
		// persisting object graph
		Publisher publisher = new Publisher("MANN", "Manning Publications Co.");
		Book book = new Book("9876543210", "Java Persistance with Hibernate, Second Edition", publisher);
		
		List<Chapter> chapters = new ArrayList<Chapter>();
		Chapter chapter1 = new Chapter("Introducing JPA and Hibernate", 1);
		chapters.add(chapter1);
		Chapter chapter2 = new Chapter("Domain models and Metadata", 2);
		chapters.add(chapter2);
		
		book.setChapters(chapters);
		
		bookStoreService.persistObjectGraph(book);
		
		// retrieving object graph
//		book = bookStoreService.retrieveObjectGraph("9876543210");
//		System.out.println(book);
	}

}
