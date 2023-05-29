package ltd.newbee.mall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.entity.AirbnbLodgingSearcheEntity;

public interface AirbnbLodgingSearchService {
	
	List<AirbnbLodgingSearcheEntity> getLodgingSearchHotelRoomInfo(Map<String, Object> filterlist);
	List<AirbnbLodgingSearcheEntity> getLodgeingSearchDefaultInfo();
	String getFilterOptions(Map<String, Object> filterlist);


}
