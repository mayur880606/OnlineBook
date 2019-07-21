package com.app.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Book;

@Repository
public class BookDao implements IBookDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Book> getBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		
	}
	
}