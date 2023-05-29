package ltd.newbee.mall.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Experience {

	private int experienceId;
	// 写了review的人数
	private int reviewCount;
	private int ratingAverage;

	public int getRatingAverage() {
		return ratingAverage;
	}

	public void setRatingAverage(int ratingAverage) {
		this.ratingAverage = ratingAverage;
	}

	private double duration;
	private String title;

	private String location;
	@JsonIgnore
	private String startDate;
	@JsonIgnore
	private String endDate;

	@JsonIgnore
	private int adultNum;
	@JsonIgnore
	private int childNum;
	@JsonIgnore
	private int babyNum;

	private int price;
	@JsonIgnore
	private int minPrice;
	@JsonIgnore
	private int maxPrice;

	private String experienceType;
	private int start;
	private int limit;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "Experience [title=" + title + ", location=" + location + ", experienceType=" + experienceType
				+ ", experienceTime=" + experienceTime + "]";
	}

	@JsonIgnore
	private String experienceTime;
	@JsonIgnore
	private int accessProviders;

	@JsonIgnore
	private String filterCommu;
	@JsonIgnore
	private String filterMove;
	@JsonIgnore
	private String filterFeeling;
	@JsonIgnore
	private String notExtremely;
	@JsonIgnore
	private String quietArea;

	@JsonIgnore
	private int currPage;
	@JsonIgnore
	private String experienceDate;
	@JsonIgnore
	private Integer totalCount;

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getExperienceDate() {
		return experienceDate;
	}

	public void setExperienceDate(String experienceDate) {
		this.experienceDate = experienceDate;
	}

	public int getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(int experienceId) {
		this.experienceId = experienceId;

	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAccessProviders() {
		return accessProviders;
	}

	public void setAccessProviders(int accessProviders) {
		this.accessProviders = accessProviders;
	}

	public String getExperienceTime() {
		return experienceTime;
	}

	public void setExperienceTime(String experienceTime) {
		this.experienceTime = experienceTime;
	}

	public String getExperienceType() {
		return experienceType;
	}

	public void setExperienceType(String experienceType) {
		this.experienceType = experienceType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getAdultNum() {
		return adultNum;
	}

	public void setAdultNum(int adultNum) {
		this.adultNum = adultNum;
	}

	public int getChildNum() {
		return childNum;
	}

	public void setChildNum(int childNum) {
		this.childNum = childNum;
	}

	public int getBabyNum() {
		return babyNum;
	}

	public void setBabyNum(int babyNum) {
		this.babyNum = babyNum;
	}

	public int getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}

	public int getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getFilterCommu() {
		return filterCommu;
	}

	public void setFilterCommu(String filterCommu) {
		this.filterCommu = filterCommu;
	}

	public String getFilterMove() {
		return filterMove;
	}

	public void setFilterMove(String filterMove) {
		this.filterMove = filterMove;
	}

	public String getFilterFeeling() {
		return filterFeeling;
	}

	public void setFilterFeeling(String filterFeeling) {
		this.filterFeeling = filterFeeling;
	}

	public String getNotExtremely() {
		return notExtremely;
	}

	public void setNotExtremely(String notExtremely) {
		this.notExtremely = notExtremely;
	}

	public String getQuietArea() {
		return quietArea;
	}

	public void setQuietArea(String quietArea) {
		this.quietArea = quietArea;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

}
