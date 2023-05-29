package ltd.newbee.mall.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.dao.HotelPicBoardMapper;
import ltd.newbee.mall.entity.HotelPicBoard;
import ltd.newbee.mall.service.HotelPicBoardService;

@Service
public class HotelPicBoardServiceImpl implements HotelPicBoardService {
	@Autowired
	HotelPicBoardMapper HotelPicBoardMapper;
	@Override
	public List<HotelPicBoard>  findHotelPicBoard(int hotelId) {
		 
        return HotelPicBoardMapper.findHotelPicBoard(hotelId);
    }

}
