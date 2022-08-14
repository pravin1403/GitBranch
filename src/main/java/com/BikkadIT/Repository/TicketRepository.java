package com.BikkadIT.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Responce.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {

	
	

}
