package com.example.booknest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImplementation implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}
	
	@Override
	public void addBook(Book book) {
		this.bookRepository.save(book); //save takes an Entity as an argument (the corresponding class with @Entity)
	}
	
	@Override
	public Book getBookById(long id) {
		//Optional is intended for use as a method return type where there is a clear need to represent "no result," 
		//and where using null is likely to cause errors. (Source = javadoc)
		Optional<Book> opt = bookRepository.findById(id);
		Book book = null;
		if(opt.isPresent()) {
			book = opt.get();
		}
		else {
			throw new RuntimeException("Book not found for id : " + id);
		}
		return book;
	}
	
	@Override
	public void deleteBookById(long id) {
		this.bookRepository.deleteById(id);
	}

}
