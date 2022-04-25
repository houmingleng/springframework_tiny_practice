package com.uplooking.pojo;

import java.io.Serializable;

public class Log implements Serializable {
	private String lid;
	private String ldo;
	private String lwho;
	private String lwhen;
	private String lwhat;
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getLdo() {
		return ldo;
	}
	public void setLdo(String ldo) {
		this.ldo = ldo;
	}
	public String getLwho() {
		return lwho;
	}
	public void setLwho(String lwho) {
		this.lwho = lwho;
	}
	public String getLwhen() {
		return lwhen;
	}
	public void setLwhen(String lwhen) {
		this.lwhen = lwhen;
	}
	public String getLwhat() {
		return lwhat;
	}
	public void setLwhat(String lwhat) {
		this.lwhat = lwhat;
	}
	public Log() {
		super();
	}
	@Override
	public String toString() {
		return "Log [lid=" + lid + ", ldo=" + ldo + ", lwho=" + lwho + ", lwhen=" + lwhen + ", lwhat=" + lwhat + "]";
	}
	public Log(String ldo, String lwho, String lwhen, String lwhat) {
		super();
		this.ldo = ldo;
		this.lwho = lwho;
		this.lwhen = lwhen;
		this.lwhat = lwhat;
	}
	
}
