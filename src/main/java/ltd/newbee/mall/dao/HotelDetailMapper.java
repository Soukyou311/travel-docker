package ltd.newbee.mall.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.entity.HotelDetail;
import ltd.newbee.mall.entity.HotelFacility;
import ltd.newbee.mall.entity.PriceDetail;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface HotelDetailMapper {

	HotelDetail getHotelDetail(@Param("hotelId") int hotelId);

	List<HotelDetail> getHotelReview(@Param("hotelId") int hotelId);

	PriceDetail getTotalPrice(
			@Param("hotelId") int hotelId, 
			@Param("checkInDate") LocalDate checkInDate,
			@Param("checkOutDate") LocalDate checkOutDate);
	
	List<HotelFacility> getHotelFacility(@Param("hotelId") int hotelId);
}
