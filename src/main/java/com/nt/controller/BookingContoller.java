package com.nt.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Booking;
import com.nt.pojo.BookingPojo;
import com.nt.pojo.InvalidDestinationNameException;
import com.nt.service.TravlingService;


@Controller
public class BookingContoller {
	@Autowired
	private TravlingService service;
	 
	/* @RequestMapping("/")
	    public String viewHomePage(Model model, @Param("keyword") String keyword)
		 {     
		       try {
		      String regex="^[^\\d\\s]+$";
		      if(keyword.matches(regex)) {
	        List<Booking> listBooking = service.listAll(keyword);
	        
	        model.addAttribute("listBooking", listBooking);
	        
	        model.addAttribute("keyword", keyword);
		      }
	          }
		      catch(NullPointerException ex) {
	             
	       
	        }
		       return "index1";   
		 } */
	
	
	            @RequestMapping("/")
	   	    public String viewHomePage(Model model, @ModelAttribute String Destination)
	   		 {     
	   		     /*  try {
	   		      String regex="^[^\\d\\s]+$";
	   		      if(Destination.matches(regex)) {*/
	   	        List<Booking> listBooking = service.listAll(Destination);
	   	        
	   	        model.addAttribute("listBooking", listBooking);
	   	        
	   	        model.addAttribute("keyword", Destination);
	   		   /*   }
	   	          }
	   		      catch(NullPointerException ex) {
	   	             
	   	       
	   	        }*/
	   		       return "index1";   
	   		 } 

	

}
