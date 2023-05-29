package ltd.newbee.mall.entity;

public class GoodsReviewDetail {
    private Integer reviewId;
    private Integer goodsId;
    private String goodsName;
    private Integer reviewRank;
    private String nickName;
    private String reviewTitle;
    private String reviewContent;
	/**
	 * @return the reviewId
	 */
	public Integer getReviewId() {
		return reviewId;
	}
	/**
	 * @param reviewId the reviewId to set
	 */
	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}
	/**
	 * @return the goodsId
	 */
	public Integer getGoodsId() {
		return goodsId;
	}
	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
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
	 * @return the reviewRank
	 */
	public Integer getReviewRank() {
		return reviewRank;
	}
	/**
	 * @param reviewRank the reviewRank to set
	 */
	public void setReviewRank(Integer reviewRank) {
		this.reviewRank = reviewRank;
	}
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
	@Override
	public String toString() {
		return "GoodsReviewDetail [reviewId=" + reviewId + ", goodsId=" + goodsId + ", goodsName=" + goodsName
				+ ", reviewRank=" + reviewRank + ", nickName=" + nickName + ", reviewTitle=" + reviewTitle
				+ ", reviewContent=" + reviewContent + "]";
	}

    // Getters and setters
}
