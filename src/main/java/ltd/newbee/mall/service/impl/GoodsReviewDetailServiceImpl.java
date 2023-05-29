package ltd.newbee.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.dao.GoodsReviewDetailMapper;
import ltd.newbee.mall.entity.GoodsReviewDetail;
import ltd.newbee.mall.service.GoodsReviewDetailService;

@Service
public class GoodsReviewDetailServiceImpl implements GoodsReviewDetailService {

	@Autowired
	private GoodsReviewDetailMapper goodsReviewDetailMapper;

	// 获取商品评价列表
	@Override
	public List<GoodsReviewDetail> getGoodsReviewsByGoodsId(Integer goodsId) {
		return goodsReviewDetailMapper.getGoodsReviewsByGoodsId(goodsId);
	}

	// 添加商品评价，并允许手动输入评价内容
	@Override
	public void addGoodsReviewDetail(GoodsReviewDetail reviewDetail) {
		// 获取原来的评价数据
		GoodsReviewDetail originReviewDetail = goodsReviewDetailMapper
				.getGoodsReviewsByGoodsId(reviewDetail.getGoodsId()).get(0);

		// 将原来的评价数据中的goodsName复制到新的评价数据中
		reviewDetail.setGoodsName(originReviewDetail.getGoodsName());

		// 将新的评价数据插入到数据库中
		goodsReviewDetailMapper.insertGoodsReviewDetail(reviewDetail);
	}
}
