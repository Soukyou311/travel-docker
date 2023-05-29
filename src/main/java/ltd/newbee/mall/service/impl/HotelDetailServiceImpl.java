package ltd.newbee.mall.service.impl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.dao.HotelDetailMapper;
import ltd.newbee.mall.entity.HotelDetail;
import ltd.newbee.mall.entity.HotelFacility;
import ltd.newbee.mall.entity.PriceDetail;
import ltd.newbee.mall.service.HotelDetailService;

@Service
public class HotelDetailServiceImpl implements HotelDetailService {

	@Autowired
	private HotelDetailMapper hotelDetailMapper;

	@Override
	public HotelDetail getHotelDetail(int hotelId) {
		return hotelDetailMapper.getHotelDetail(hotelId);
	}

	@Override
	public List<HotelDetail> getHotelReview(int hotelId) {
	    List<HotelDetail> hotelReview = hotelDetailMapper.getHotelReview(hotelId);

	    return hotelReview;
	}



	@Override
	public PriceDetail getTotalPrice(int hotelId, LocalDate checkInDate, LocalDate checkOutDate) {
	
		return  hotelDetailMapper.getTotalPrice(hotelId, checkInDate, checkOutDate);
	}


	@Override
	public List<HotelFacility> getHotelFacility(int hotelId) {
		
		return hotelDetailMapper.getHotelFacility(hotelId);
	}


}
