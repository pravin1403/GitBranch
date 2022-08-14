package com.BikkadIT.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Responce.Passanger;
import com.BikkadIT.Responce.Ticket;
import com.BikkadIT.Service.TicketService;

@RestController
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@PostMapping(value = "/bookTicket", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> getTicket(@RequestBody Passanger passanger) {

		String msg=ticketService.ticketStatus(passanger);

		if (msg == null) {

			return null;
		}else {
			
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}

	}
}
