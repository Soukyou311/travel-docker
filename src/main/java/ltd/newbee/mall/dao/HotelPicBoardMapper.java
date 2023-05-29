package ltd.newbee.mall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import ltd.newbee.mall.entity.HotelPicBoard;

public interface HotelPicBoardMapper {
	List<HotelPicBoard> findHotelPicBoard(@Param("hotelId") int hotelId);
	int findReviewCount(@Param("hotelId") int hotelId);
}
