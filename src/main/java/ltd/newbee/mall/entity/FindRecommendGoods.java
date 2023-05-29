package ltd.newbee.mall.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.math.RoundingMode;
import org.springframework.stereotype.Component;

@Component
public class FindRecommendGoods {
	
	private Integer goodId;          // 商品ID
	private String  goodsName;       // 商品名称
	private BigDecimal intaxPrice;  // 含税商品价格
	private String  goodsCoverImg;   // 商品封面图
	private String  goodsSellStatus; // 商品销售状态
	private LocalDateTime updateTime; // 商品更新时间
	
	
	/**
	 * @return the goodId
	 */
	public Integer getGoodId() {
		return goodId;
	}
	/**
	 * @param goodId the goodId to set
	 */
	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
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
	 * @return the intaxPrice
	 */
	public String getIntaxPrice() {
	    BigDecimal bd = new BigDecimal(intaxPrice.toString());
	    bd = bd.setScale(0, RoundingMode.HALF_UP);
	    return "¥" + bd.toString();
	}

	/**
	 * @param intaxPrice the intaxPrice to set
	 */
	public void setIntaxPrice(BigDecimal intaxPrice) {
		this.intaxPrice = intaxPrice;
	}

	/**
	 * @return the goodsCoverImg
	 */
	public String getGoodsCoverImg() {
		return goodsCoverImg;
	}
	/**
	 * @param goodsCoverImg the goodsCoverImg to set
	 */
	public void setGoodsCoverImg(String goodsCoverImg) {
		this.goodsCoverImg = goodsCoverImg;
	}
	/**
	 * @return the goodsSellStatus
	 */
	public String getGoodsSellStatus() {
		return goodsSellStatus;
	}
	/**
	 * @param goodsSellStatus the goodsSellStatus to set
	 */
	public void setGoodsSellStatus(String goodsSellStatus) {
		this.goodsSellStatus = goodsSellStatus;
	}
	/**
	 * @return the updateTime
	 */
	public LocalDateTime getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}
    @Override
	public String toString() {
		return "FindRecommendGoods [goodId=" + goodId + ", goodsName=" + goodsName + ", intaxPrice=" + intaxPrice
				 + ", goodsCoverImg=" + goodsCoverImg + ", goodsSellStatus="
				+ goodsSellStatus + ", updateTime=" + updateTime + "]";
	}
	
	
	}


