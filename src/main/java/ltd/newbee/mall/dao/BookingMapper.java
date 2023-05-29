package ltd.newbee.mall.dao;




import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.entity.BookingDetail;
import ltd.newbee.mall.entity.PayDetail;

public interface BookingMapper {
	
	List <Map<String, Object> >hotelInfo(@Param("hotelId") int hotelId,
			@Param("checkInDate") String checkInDate,
			@Param("checkOutDate") String checkOutDate);
	void booking(BookingDetail bookingDetail);
	void payment(PayDetail payDetail);

}
