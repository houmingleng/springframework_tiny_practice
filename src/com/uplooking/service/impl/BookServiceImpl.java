package com.uplooking.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.uplooking.dao.BookMapper;
import com.uplooking.dao.LogMapper;
import com.uplooking.pojo.Book;
import com.uplooking.pojo.Log;
import com.uplooking.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	@Qualifier("bookMapper")
	private BookMapper bookMapper;
	
	@Autowired
	@Qualifier("logMapper")
	private LogMapper logMapper;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Map<String, Object> addBook(String name,Book book) throws Exception {
		Map<String,Object> result = new HashMap<String, Object>();
		if(bookMapper.insert(book)==1){			
			Log log = new Log("新书入库",name, 
					new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),book.toString());
			if(logMapper.insert(log)==1){
				result.put("code", 200);
				result.put("message", "新书入库成功");
			}else{
				result.put("code", 302);
				result.put("message", "新书入库失败(日志写入出错)");
			}	
		}else{
			result.put("code", 301);
			result.put("message", "新书入库失败");
		}
		return result;
	}

}
