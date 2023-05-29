package ltd.newbee.mall.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;
import ltd.newbee.mall.entity.Host;

public interface HostMapper {
	List<Host> findHost(@Param("hotelId") int hotelId);
	int findReviewCount(@Param("hotelId") int hotelId);
}