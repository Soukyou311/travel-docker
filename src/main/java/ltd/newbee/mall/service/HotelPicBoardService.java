package ltd.newbee.mall.service;

import java.util.List;

import ltd.newbee.mall.entity.HotelPicBoard;



public interface HotelPicBoardService {
	List<HotelPicBoard>  findHotelPicBoard(int hotelId);
}
