package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.Chapter;
import model.Publisher;

public class BookStoreService {
	private Connection connection = null;
	
	public void persistObjectGraph(Book book) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/libreria_hibernate", "root", "1234");
			
			PreparedStatement ps = connection.prepareStatement("INSERT INTO PUBLISHER (CODE, PUBLISHER_NAME) VALUES (?,?)");
			ps.setString(1, book.getPublisher().getCode());
			ps.setString(2, book.getPublisher().getName());
			ps.executeUpdate();
			
			ps.close();
			
			ps = connection.prepareStatement("INSERT INTO BOOK (ISBN, BOOK_NAME, PUBLISHER_CODE) VALUES (?,?,?)");
			ps.setString(1, book.getIsbn());
			ps.setString(2, book.getName());
			ps.setString(3, book.getPublisher().getCode());
			ps.executeUpdate();
			
			ps.close();
			
			ps = connection.prepareStatement("INSERT INTO CHAPTER (BOOK_ISBN, CHAPTER_NUM, TITLE) VALUES (?,?,?)");
			for (Chapter chapter : book.getChapters()) {
				ps.setString(1, book.getIsbn());
				ps.setInt(2, chapter.getChapterNumber());
				ps.setString(3, chapter.getTitle());
				ps.executeUpdate();
			}
			
			ps.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Book retrieveObjectGraph(String isbn) {
		Book book = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/libreria_hibernate","root", "1234");
		
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM BOOK, PUBLISHER WHERE BOOK.PUBLISHER_CODE = PUBLISHER.CODE AND BOOK.ISBN = ?");
			ps.setString(1, isbn);
			ResultSet rs = ps.executeQuery();
			
			book = new Book();
			if (rs.next()) {
				book.setIsbn(rs.getString("ISBN"));
				book.setName(rs.getString("BOOK_NAME"));
				
				Publisher publisher = new Publisher();
				publisher.setCode(rs.getString("CODE"));
				publisher.setName(rs.getString("PUBLISHER_NAME"));
				book.setPublisher(publisher);
			}
			
			rs.close();
			
			List<Chapter> chapters = new ArrayList<Chapter>();
			ps = connection.prepareStatement("SELECT * FROM CHAPTER WHERE BOOK_ISBN = ?");
			ps.setString(1, isbn);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Chapter chapter = new Chapter();
				chapter.setTitle(rs.getString("TITLE"));
				chapter.setChapterNumber(rs.getInt("CHAPTER_NUM"));
				chapters.add(chapter);
			}
			
			book.setChapters(chapters);
			
			rs.close();
			ps.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		} finally {
			try {
				connection.close();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return book;
		
	}
}
