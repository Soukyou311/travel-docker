package ltd.newbee.mall.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.lang.Nullable;

import ltd.newbee.mall.entity.GoodsReviewDetail;

public interface GoodsReviewDetailService {

	// 获取商品评价列表
	List<GoodsReviewDetail> getGoodsReviewsByGoodsId(Integer goodsId);

	// 添加商品评价，并允许手动输入评价内容
	void addGoodsReviewDetail(GoodsReviewDetail reviewDetail);

}
