package com.nt.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Booking;

import com.nt.repository.TravlingRepo;
@Service
public class TravlingService {
    @Autowired
   private TravlingRepo repo;
    
List<Booking> s ;
	public List<Booking> listAll(String keyword) {
    	//ch=keyword;
                 
                    return  repo.findByKeyword(keyword) ;
                   
                // List<Booking>  s= repo.findAll();  
                
	}
 // String ch;
  /* public static boolean isAlpha(String s) {
        if (isHavingSpaceOnly(s)) {
            return false;
        }
        final int sz = ch.length();
        for (int i = 0; i < sz; i++) {
            if (!Character.isLetter(ch.charAt(i))) {
                 throw new InvalidDestinationNameException();
            }
        }
        return true;
    }*/
     
   /* public static boolean isHavingSpaceOnly(final CharSequence ch) {
        return ch == " ";
    }*/
    
   
}
    
	
	
	
	



