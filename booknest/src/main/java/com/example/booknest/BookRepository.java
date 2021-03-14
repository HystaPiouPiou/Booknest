package com.example.booknest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


//Créer une interface pour réaliser des queries SQL

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
	@Query("select b from Book b where b.title LIKE %?1%" + "OR b.author LIKE %?1%")
	List<Book> findByTitleOrAuthor(String keyword);
	
	@Query("select b from Book b where read_statut=1")
	List<Book> findAllRead();
	
	@Query("select b from Book b where read_statut=0")
	List<Book> findAllNotRead();
}
