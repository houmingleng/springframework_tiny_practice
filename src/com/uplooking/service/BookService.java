package com.uplooking.service;

import java.util.Map;

import com.uplooking.pojo.Book;

public interface BookService {

	Map<String, Object> addBook(String name,Book book) throws Exception;
	
}
