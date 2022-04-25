package com.uplooking.dao;

import org.apache.ibatis.annotations.Param;

import com.uplooking.pojo.Book;

public interface BookMapper {
	Book findById(@Param("id")String id);
	int insert(Book book);
	int delete(@Param("id")int id);
}	
