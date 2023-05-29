package ltd.newbee.mall.controller.mall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ltd.newbee.mall.entity.HotelDetail;
import ltd.newbee.mall.entity.PriceDetail;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ltd.newbee.mall.service.HotelDetailService;

@RestController
public class HotelDetailController {

	@Autowired
	private HotelDetailService hotelDetailService;

	@GetMapping("hoteldetail")
	public HotelDetail getHotelDetail(@RequestParam int hotelId) {
		return hotelDetailService.getHotelDetail(hotelId);

	}
	@CrossOrigin("http://localhost:3000")
	@GetMapping("hotelreview")
	public Map<String, Object> getHotelReview(@RequestParam int hotelId) {

	    List<HotelDetail> hotelReviews = hotelDetailService.getHotelReview(hotelId);
	    double cleanPoint = 0, communicationPoint = 0, infoPoint = 0, locationPoint = 0, checkinPoint = 0, pricePoint = 0;
	    double avgCleanPoint=0, avgCommunicationPoint = 0, avgInfoPoint = 0, avgLocationPoint = 0, avgCheckinPoint = 0, avgPricePoint = 0;
	    for(int i = 0; i < hotelReviews.size();i++) {
	    	
	    	double tempCleanPoint = hotelReviews.get(i).getPointClean();
	    	cleanPoint += tempCleanPoint;
	    	avgCleanPoint = cleanPoint / (i+1); 	
	    	
	    	double tempCommunicationPoint = hotelReviews.get(i).getPointCommunication();
	    	communicationPoint += tempCommunicationPoint;
	    	avgCommunicationPoint = communicationPoint / (i+1); 
	    	
	    	
	    	double tempInfoPoint = hotelReviews.get(i).getPointInfo();
	    	infoPoint += tempInfoPoint;
	    	avgInfoPoint = infoPoint / (i+1); 	
	    	
	    	double tempLocationPoint = hotelReviews.get(i).getPointLocation();
	    	locationPoint += tempLocationPoint;
	    	avgLocationPoint = locationPoint / (i+1); 	
	    	
	    	double tempCheckinPoint = hotelReviews.get(i).getPointCheckin();
	    	checkinPoint += tempCheckinPoint;
	    	avgCheckinPoint = checkinPoint / (i+1); 	
	    	
	    	double tempPricePoint = hotelReviews.get(i).getPointPrice();
	    	pricePoint += tempPricePoint;
	    	avgPricePoint = pricePoint / (i+1); 	
	    	
	    	
	    }
	    String formattedAvgCleanPoint = String.format("%.1f", avgCleanPoint);
	    String formattedAvgCommunicationPoint = String.format("%.1f", avgCommunicationPoint);
	    String formattedAvgInfoPoint = String.format("%.1f", avgInfoPoint);
	    String formattedAvgLocationPoint = String.format("%.1f", avgLocationPoint);
	    String formattedAvgCheckinPoint = String.format("%.1f", avgCheckinPoint);
	    String formattedAvgPricePoint = String.format("%.1f", avgPricePoint);
	    int reviewNum = hotelReviews.size();
	    double hotelStar = hotelReviews.get(0).getHotelStar();
	    String formattedHotelStar = String.format("%.1f", hotelStar);
	    Map<String,Object>hotelReviewsResultMap = new HashMap<>();
	    hotelReviewsResultMap.put("hotelReviews", hotelReviews);
	    hotelReviewsResultMap.put("cleanPoint", formattedAvgCleanPoint);
	    hotelReviewsResultMap.put("communicationPoint", formattedAvgCommunicationPoint);
	    hotelReviewsResultMap.put("infoPoint", formattedAvgInfoPoint);
	    hotelReviewsResultMap.put("locationPoint", formattedAvgLocationPoint);
	    hotelReviewsResultMap.put("checkinPoint", formattedAvgCheckinPoint);
	    hotelReviewsResultMap.put("pricePoint", formattedAvgPricePoint);
	    hotelReviewsResultMap.put("reviewNum", reviewNum);
	    hotelReviewsResultMap.put("hotelStar", formattedHotelStar);
	    
	    return hotelReviewsResultMap;
	}



	@GetMapping("hoteldetail/price")
	public Map<String, Object> getPriceDetail(@RequestParam int hotelId,
			@RequestParam("checkInDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkInDate,
			@RequestParam("checkOutDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkOutDate) {

		PriceDetail priceDetail = hotelDetailService.getTotalPrice(hotelId, checkInDate, checkOutDate);
		    
		    int totalBookingDays = (int) ChronoUnit.DAYS.between(checkInDate, checkOutDate);
		    double totalPrice =priceDetail.getPricePerNight() * totalBookingDays + priceDetail.getCleaningFee();
		    double serviceFee =Math.round(totalPrice*0.14);
		    DecimalFormat df = new DecimalFormat("#,###");
		    String totalFee = df.format(totalPrice+serviceFee);
		    
		    Map<String, Object> hotelFee = new HashMap<>();
		    hotelFee.put("checkInDate", checkInDate);
		    hotelFee.put("checkOutDate", checkOutDate);
		    hotelFee.put("perNightPrice", priceDetail.getPricePerNight());
		    hotelFee.put("cleaningFee", priceDetail.getCleaningFee());
		    hotelFee.put("totalPrice", totalPrice);
		    hotelFee.put("totalPrice", totalFee);
		    
		    
		    return hotelFee;
		
		  }

	

}
