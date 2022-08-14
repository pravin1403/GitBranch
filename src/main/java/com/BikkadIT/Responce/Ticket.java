package com.BikkadIT.Responce;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
	
	@Id
	private int trainNo;
	
	private String trainName;

	private String pnr;
	
	private String ticketStatus;
	
	private double ticketPrice;
	


	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "Ticket [trainNo=" + trainNo + ", trainName=" + trainName + ", pnr=" + pnr + ", ticketStatus="
				+ ticketStatus + ", ticketPrice=" + ticketPrice + "]";
	}

	


	


	

	

	
	
	
	
	
	
}
