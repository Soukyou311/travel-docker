package ltd.newbee.mall.controller.mall;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ltd.newbee.mall.entity.AirbnbLodgingSearcheEntity;
import ltd.newbee.mall.service.AirbnbLodgingSearchService;
@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/lodging_Info")
public class AirbnbLodgingSearchController {
	@Autowired
	private AirbnbLodgingSearchService airbnbLodgingSearchService;

	@PostMapping("/lodging_filter_detail")
	public List<AirbnbLodgingSearcheEntity> getFilterDetails(@RequestBody Map<String, Object> filterlist) {
		return airbnbLodgingSearchService.getLodgingSearchHotelRoomInfo(filterlist);
	}

	@PostMapping("/lodging_default_detail")
	public List<AirbnbLodgingSearcheEntity> getLodgeingSearchDefaultInfo() {
		return airbnbLodgingSearchService.getLodgeingSearchDefaultInfo();
	}
	 @PostMapping("/countResult")
	  public String getFilterOptions(
	      @RequestBody Map<String, Object> filterlist) {
	    String result= airbnbLodgingSearchService.getFilterOptions(filterlist);
	 return result; 
	 }
}
