package com.nt.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nt.model.Booking;

@Repository
public interface TravlingRepo extends JpaRepository<Booking,Integer> {
	 @Query( "select  b from Booking b where CONCAT(b.BookingId, b.Destination) like %?1%")
	 List<Booking> findByKeyword(@Param("keyword") String keyword);

	

}
