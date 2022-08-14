package com.BikkadIT.Responce;

import javax.persistence.Entity;

@Entity
public class Passanger {

	
	private String fName;
	
	private String lName;
	
	private String from;
	
	private String to;
	
	private String doj;

	
	

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Passanger [fName=" + fName + ", lName=" + lName + ", from=" + from + ", to=" + to + ", doj=" + doj
				+ "]";
	}

	
	
	
	

	
	
}
