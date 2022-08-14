package com.BikkadIT.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Repository.TicketRepository;
import com.BikkadIT.Responce.Passanger;
import com.BikkadIT.Responce.Passangers;
import com.BikkadIT.Responce.Ticket;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	public String ticketStatus(Passangers passangers) {
		
		List<Ticket> findAll = ticketRepository.findAll();
		
		Passanger[] a=new Passanger[5];
		for(int i=0;i<5;i++) {
			List<Passanger> passangers2 = passangers.getPassangers();
			for(Passanger p:passangers2) {
			a[i]=p;
			}
		}
		
		
		List<String> list=new ArrayList();
		
		String msg1;
		
		String msg2;
		
		for(Ticket t:findAll) {
			
			if(passangers.getTrainNumber()==t.getTrainNo()) {
				
			     msg1="Train Number :"+t.getTrainNo()
			     +"\n Traing Name :"+t.getTrainName()
				+"\n Train PNR Number :"+t.getPnr()
				+"\n Booking Status :"+t.getTicketStatus();
			
			}
			
			for(Passanger p:passangers.getPassangers()) {
				
				list.add("\n Name :"+p.getfName()+" "+p.getlName()
				+"\n Departure :"+p.getFrom()
				+"\n Destination :"+p.getTo()+"\n Date of Journy :"
				+p.getDoj()
				+"\n Ticket Price :"+t.getTicketPrice()
				);
			}
			
			msg2="Number of Passangers Details"+list;
			
			return msg1+msg2;
		}
		
		return null;
		


	}

}
