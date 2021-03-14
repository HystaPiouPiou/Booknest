package com.example.booknest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Entity class
 * Defines what will be stored in the DB
 */
@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //AUTO ou IDENTITY ? VERIFIER DIFF
	public long id; //DB id
	
	@Column(name = "title")
	public String title;
	@Column(name = "author")
	public String author;
	@Column(name = "serie")
	public String serieName;
	@Column(name = "serie_nb")
	public int serieNumber;
	@Column(name = "read_statut")
	public int readStatut;
	
	public Book() {
		
	}
	
	/*
	protected Book(String t, String a, String sName, int sNumber) {
		this.title = t;
		this.author = a;
		this.serieName = sName;
		this.serieNumber = sNumber;
	}
	
	protected Book(String t, String a) {
		this.title = t;
		this.author = a;
	}*/
	
	
	//GETTERS / SETTERS
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSerieName() {
		return serieName;
	}

	public void setSerieName(String serieName) {
		this.serieName = serieName;
	}

	public int getSerieNumber() {
		return serieNumber;
	}

	public void setSerieNumber(int serieNumber) {
		this.serieNumber = serieNumber;
	}
	
	public int getReadStatut() {
		return readStatut;
	}
	
	public void setReadStatut(int readStatut) {
		this.readStatut = readStatut;
	}

}
