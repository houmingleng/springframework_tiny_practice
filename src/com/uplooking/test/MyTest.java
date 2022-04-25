package com.uplooking.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.uplooking.pojo.Book;
import com.uplooking.service.BookService;

public class MyTest {

	@Test
	public void test() throws Exception {
		
		/*DataSourceTransactionManager transactionManager;
		transactionManager.setDataSource(dataSource);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService bookService = (BookService) context.getBean("bookService");
		Book book = new Book("书籍1","作者1","2019-11-27 0:00:00");
		String name ="张三";
		System.out.println(bookService.addBook(name,book));
	}
}
