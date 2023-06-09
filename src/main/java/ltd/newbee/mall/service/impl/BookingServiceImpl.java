package ltd.newbee.mall.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.dao.BookingMapper;
import ltd.newbee.mall.entity.BookingDetail;
import ltd.newbee.mall.entity.PayDetail;
import ltd.newbee.mall.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingMapper bookingMapper;

	@Override
	public List<Map<String, Object>> hotelInfo(int hotelId, String checkInDate, String checkOutDate) {

		return bookingMapper.hotelInfo(hotelId, checkInDate, checkOutDate);
	}

	@Override
	public void booking(BookingDetail bookingDetail) {

		bookingMapper.booking(bookingDetail);

	}

	@Override
	public void payment(PayDetail payDetail) {
		bookingMapper.payment(payDetail);

	}

}
