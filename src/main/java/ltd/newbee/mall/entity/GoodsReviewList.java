package ltd.newbee.mall.entity;

import java.sql.Date;
import java.util.List;

public class GoodsReviewList {

	private String userName;
	private String reviewId;
	private int reviewRank;
	private String goodsName;
	private String reviewTitle;
	private String reviewContent;
	private Date reviewDate;
	private int likeCount;
	private String reviewImage1;
  	private String reviewImage2;
  	private String reviewImage3;
    private String reviewImage4;
  	private String reviewImage5; 
  	private int pageNo;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName + "さん";
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the reviewId
	 */
	public String getReviewId() {
		return reviewId;
	}

	/**
	 * @param reviewId the reviewId to set
	 */
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	/**
	 * @return the reviewRank
	 */
	public int getReviewRank() {
		return reviewRank;
	}

	/**
	 * @param reviewRank the reviewRank to set
	 */
	public void setReviewRank(int reviewRank) {
		this.reviewRank = reviewRank;
	}

	/**
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}

	/**
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * @return the reviewTitle
	 */
	public String getReviewTitle() {
		return reviewTitle;
	}

	/**
	 * @param reviewTitle the reviewTitle to set
	 */
	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	/**
	 * @return the reviewContent
	 */
	public String getReviewContent() {
		return reviewContent;
	}

	/**
	 * @param reviewContent the reviewContent to set
	 */
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	/**
	 * @return the reviewDate
	 */
	public Date getReviewDate() {
		return reviewDate;
	}

	/**
	 * @param reviewDate the reviewDate to set
	 */
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	/**
	 * @return the likeCount
	 */
	public int getLikeCount() {
		return likeCount;
	}

	/**
	 * @param likeCount the likeCount to set
	 */
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	@Override
	public String toString() {
		return "GoodsReviewList [userName=" + userName + ", reviewId=" + reviewId + ", reviewRank=" + reviewRank
				+ ", goodsName=" + goodsName + ", reviewTitle=" + reviewTitle + ", reviewContent=" + reviewContent
				+ ", reviewDate=" + reviewDate + ", likeCount=" + likeCount + ", reviewImage1=" + reviewImage1
				+ ", reviewImage2=" + reviewImage2 + ", reviewImage3=" + reviewImage3 + ", reviewImage4=" + reviewImage4
				+ ", reviewImage5=" + reviewImage5 + "]";
	}

	/**
	 * @return the reviewImage1
	 */
	public String getReviewImage1() {
		return reviewImage1;
	}

	/**
	 * @param reviewImage1 the reviewImage1 to set
	 */
	public void setReviewImage1(String reviewImage1) {
		this.reviewImage1 = reviewImage1;
	}

	/**
	 * @return the reviewImage2
	 */
	public String getReviewImage2() {
		return reviewImage2;
	}

	/**
	 * @param reviewImage2 the reviewImage2 to set
	 */
	public void setReviewImage2(String reviewImage2) {
		this.reviewImage2 = reviewImage2;
	}

	/**
	 * @return the reviewImage3
	 */
	public String getReviewImage3() {
		return reviewImage3;
	}

	/**
	 * @param reviewImage3 the reviewImage3 to set
	 */
	public void setReviewImage3(String reviewImage3) {
		this.reviewImage3 = reviewImage3;
	}

	/**
	 * @return the reviewImage4
	 */
	public String getReviewImage4() {
		return reviewImage4;
	}

	/**
	 * @param reviewImage4 the reviewImage4 to set
	 */
	public void setReviewImage4(String reviewImage4) {
		this.reviewImage4 = reviewImage4;
	}

	/**
	 * @return the reviewImage5
	 */
	public String getReviewImage5() {
		return reviewImage5;
	}

	/**
	 * @param reviewImage5 the reviewImage5 to set
	 */
	public void setReviewImage5(String reviewImage5) {
		this.reviewImage5 = reviewImage5;
	}

	/**
	 * @return the pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}






}
