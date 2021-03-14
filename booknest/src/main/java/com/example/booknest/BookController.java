package com.example.booknest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class BookController {
	
	//inject service class to generate a list of books read from the database
	@Autowired
	private BookService bookService;
	//Model objects are used to transport data from controller to view
	
	//displays table of books from DB
	@GetMapping("/books")
	public String showBooks(Model model){
		model.addAttribute("bookList", bookService.getAllBooks()); //bookList is the element passed to the Thymeleaf table in the th:each="book : ${bookList}" line
		return "booklist"; //name of the Thymeleaf html doc
	}
	
	//-------------------------------------
	
	//Add book methods (go to form page and then save form
	//go to /newBook page
	@GetMapping("/newBook")
	public String goToNewBook(Model model) {
		//model will link form (html) and java object (SQL db)
		Book book = new Book();
		model.addAttribute("book", book);
		return "newBook"; 
	}
	
	//gets the results from a html input and saves it to DB
	@PostMapping("/saveBook")
	public String saveBook(@ModelAttribute("book") Book book) {
		bookService.addBook(book);
		return "redirect:/books";
	}
	
	//--------------------------------
	@GetMapping("/editBook/{id}")
	public String editBook(@PathVariable (value = "id") long id, Model model) { //binds the id obtained through the "edit" button of a book
		
		Book book = bookService.getBookById(id);
		
		//help to pre-fill the form
		model.addAttribute("book", book);
		return "editBook";
	}
	
	@GetMapping("/deleteBook/{id}")
		public String deleteBook(@PathVariable (value = "id") long id) {
			bookService.deleteBookById(id);
			return "redirect:/books";
		}
}
