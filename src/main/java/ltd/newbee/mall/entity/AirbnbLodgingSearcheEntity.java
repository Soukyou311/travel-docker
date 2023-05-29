package ltd.newbee.mall.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AirbnbLodgingSearcheEntity {
	private String hotelName;
	private int pricePerNight;
	private int hotelId;
	@JsonIgnore
	private int roomId;
	private float distance;
	private String roomName;
	private String hotelImage;
	private int totalPrice;
	@JsonIgnore
	private Date checkInDate;
	
	private Date checkOutDate;
	private float avgPoint;
	@JsonIgnore
	private double weightedScore;
	@JsonIgnore
	private int pageNum;
	@JsonIgnore
	private int pageSize;
	private String category;
	private String city;
	private String state;
	private String minCheckOutDate;
	private String availableCheckInDate;
	private String country;
	private String filterId;
	  private int countFilter;

	  public int getCountFilter() {
	    return countFilter;
	  }

	  public void setCountFilter(int countFilter) {
	    this.countFilter = countFilter;
	  }

	  public String getFilterId() {
	    return filterId;
	  }

	  public void setFilterId(String filterId) {
	    this.filterId = filterId;
	  }


	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the pricePerNight
	 */
	public int getPricePerNight() {
		return pricePerNight;
	}

	/**
	 * @param pricePerNight the pricePerNight to set
	 */
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}


	/**
	 * @return the hotelId
	 */
	public int getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId the hotelId to set
	 */
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * @return the roomId
	 */
	public int getRoomId() {
		return roomId;
	}

	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	/**
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	/**
	 * @return the hotelImage
	 */
	public String getHotelImage() {
		return hotelImage;
	}

	/**
	 * @param hotelImage the hotelImage to set
	 */
	public void setHotelImage(String hotelImage) {
		this.hotelImage = hotelImage;
	}

	/**
	 * @param checkOutDate
	 * @param checkInDate
	 * @return the totalPrice
	 */
	public int getTotalPrice(Date checkOutDate, Date checkInDate) {
		return (int) (checkOutDate.getTime() - checkInDate.getTime() * pricePerNight);
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the avgPoint
	 */
	public float getAvgPoint() {
		return avgPoint;
	}

	/**
	 * @param avgPoint the avgPoint to set
	 */
	public void setAvgPoint(float avgPoint) {
		this.avgPoint = avgPoint;
	}
	@Override
	public String toString() {
		return "AirbnbLodgingSearcheEntity [hotelName=" + hotelName + ", pricePerNight=" + pricePerNight + ", hotelId="
				+ hotelId + ", roomId=" + roomId + ", roomName=" + roomName + ", hotelImage=" + hotelImage
				+ ", totalPrice=" + totalPrice + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", avgPoint=" + avgPoint + "]";
	}

	/**
	 * @return the pageNum
	 */
	public int getPageNum() {
		return pageNum;
	}

	/**
	 * @param pageNum the pageNum to set
	 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public String getMinCheckOutDate() {
		return minCheckOutDate;
	}

	public void setMinCheckOutDate(String minCheckOutDate) {
		this.minCheckOutDate = minCheckOutDate;
	}

	public String getAvailableCheckInDate() {
		return availableCheckInDate;
	}

	public void setAvailableCheckInDate(String availableCheckInDate) {
		this.availableCheckInDate = availableCheckInDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}



