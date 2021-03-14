package com.example.booknest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Créer une interface pour réaliser des queries SQL

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
