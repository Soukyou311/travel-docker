package ltd.newbee.mall.entity;

import java.sql.Date;



public class HotelDetail {
	private int roomId;
	private int categoryId;
	private String hotelName;
	private String pricePerNight;
	private String hotelArea;
	private String hotelAmenity;
	private String briefIntroduction;
	private String hotelIntroduction;
	private String imgUrl;
	private String ownerName;
	private String ownerPicture;
	private String userName;
	private String userPhoto;
	private String reviewDetail;
	private int reviewId;
	private Date reviewDate;
	private int pointClean;
	private int pointCommunication;
	private int pointInfo;
	private int pointLocation;
	private int pointPrice;
	private int pointCheckin;
	private double hotelStar;
	private int hotelId;
	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(String pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerPicture() {
		return ownerPicture;
	}

	public void setOwnerPicture(String ownerPicture) {
		this.ownerPicture = ownerPicture;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getHotelArea() {
		return hotelArea;
	}

	public void setHotelArea(String hotelArea) {
		this.hotelArea = hotelArea;
	}

	public String getHotelAmenity() {
		return hotelAmenity;
	}

	public void setHotelAmenity(String hotelAmenity) {
		this.hotelAmenity = hotelAmenity;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getBriefIntroduction() {
		return briefIntroduction;
	}

	public void setBriefIntroduction(String briefIntroduction) {
		this.briefIntroduction = briefIntroduction;
	}

	public String getHotelIntroduction() {
		return hotelIntroduction;
	}

	public void setHotelIntroduction(String hotelIntroduction) {
		this.hotelIntroduction = hotelIntroduction;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public String toString() {
		return "HotelDetail [roomId=" + roomId + ", categoryId=" + categoryId + ", hotelName=" + hotelName
				+ ", pricePerNight=" + pricePerNight + ", hotelArea=" + hotelArea + ", hotelAmenity=" + hotelAmenity
				+ ", briefIntroduction=" + briefIntroduction + ", hotelIntroduction=" + hotelIntroduction + ", imgUrl="
				+ imgUrl + ", ownerName=" + ownerName + ", ownerPicture=" + ownerPicture + ", userName=" + userName
				+ ", userPhoto=" + userPhoto + ", reviewDetail=" + reviewDetail + ", reviewId=" + reviewId
				+ ", reviewDate=" + reviewDate + ", pointClean=" + pointClean + ", pointCommunication="
				+ pointCommunication + ", pointInfo=" + pointInfo + ", pointLocation=" + pointLocation + ", pointPrice="
				+ pointPrice + ", pointCheckin=" + pointCheckin + "]";
	}



	public String getReviewDetail() {
		return reviewDetail;
	}

	public void setReviewDetail(String reviewDetail) {
		this.reviewDetail = reviewDetail;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public int getPointClean() {
		return pointClean;
	}

	public void setPointClean(int pointClean) {
		this.pointClean = pointClean;
	}

	public int getPointCommunication() {
		return pointCommunication;
	}

	public void setPointCommunication(int pointCommunication) {
		this.pointCommunication = pointCommunication;
	}

	public int getPointInfo() {
		return pointInfo;
	}

	public void setPointInfo(int pointInfo) {
		this.pointInfo = pointInfo;
	}

	public int getPointLocation() {
		return pointLocation;
	}

	public void setPointLocation(int pointLocation) {
		this.pointLocation = pointLocation;
	}

	public int getPointPrice() {
		return pointPrice;
	}

	public void setPointPrice(int pointPrice) {
		this.pointPrice = pointPrice;
	}

	public int getPointCheckin() {
		return pointCheckin;
	}

	public void setPointCheckin(int pointCheckin) {
		this.pointCheckin = pointCheckin;
	}

	public double getHotelStar() {
		return hotelStar;
	}

	public void setHotelStar(double hotelStar) {
		this.hotelStar = hotelStar;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

}