package com.uplooking.pojo;

import java.io.Serializable;

public class Book implements Serializable {
	private String bid;
	private String btitle;
	private String bauthor;
	private String bpublic;
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public String getBpublic() {
		return bpublic;
	}
	public void setBpublic(String bpublic) {
		this.bpublic = bpublic;
	}
	public Book() {
		super();
	}
	public Book(String btitle, String bauthor, String bpublic) {
		super();
		this.btitle = btitle;
		this.bauthor = bauthor;
		this.bpublic = bpublic;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", btitle=" + btitle + ", bauthor=" + bauthor + ", bpublic=" + bpublic + "]";
	}
	
}
