package com.example.booknest;

import java.util.List;

import org.springframework.stereotype.Service;

//implemented by BookServiceImplementation
@Service
public interface BookService {
	
	//CRUD basics
	List<Book> getAllBooks(String keyword); //read db method for GET Requests and display in html
	void addBook(Book book); //create a book in browser and send it to db = POST request
	Book getBookById(long id);
	void deleteBookById(long id);
	
	//Filter and search options
	List<Book> getAllReadBooks();
	List<Book> getAllNotReadBooks();
	//List<Book> getByKeyword(String keyword);
	
}
