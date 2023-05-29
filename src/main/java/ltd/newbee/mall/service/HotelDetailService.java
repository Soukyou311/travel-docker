package ltd.newbee.mall.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.entity.HotelDetail;
import ltd.newbee.mall.entity.HotelFacility;
import ltd.newbee.mall.entity.PriceDetail;

public interface HotelDetailService {

	HotelDetail getHotelDetail(@Param(value = "hotelId") int hotelId);

	List<HotelDetail> getHotelReview( int hotelId);

	PriceDetail getTotalPrice(@Param("hotelId") int hotelId, 
			@Param("checkInDate") LocalDate checkInDate,
			@Param("checkOutDate") LocalDate checkOutDate);
	
	List<HotelFacility> getHotelFacility(@Param("hotelId") int hotelId);

}
