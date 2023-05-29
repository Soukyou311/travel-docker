package ltd.newbee.mall.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ltd.newbee.mall.entity.AirbnbLodgingSearcheEntity;
@Mapper
public interface AirbnbLodgingSearchMapper {
	List<AirbnbLodgingSearcheEntity> getLodgingSearchHotelRoomInfo(Map<String, Object> filterlist);
	List<AirbnbLodgingSearcheEntity> getLodgeingSearchDefaultInfo();
	int findFilterCheckCount(Map<String, Object> filterlist);
	
}
