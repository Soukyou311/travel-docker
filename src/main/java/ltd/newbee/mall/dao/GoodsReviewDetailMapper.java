package ltd.newbee.mall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import ltd.newbee.mall.entity.GoodsReviewDetail;

@Mapper
public interface GoodsReviewDetailMapper {
  
  /**
   * 获取指定商品的评价列表
   * @param goodsId 商品ID
   * @return 评价列表
   */
	 List<GoodsReviewDetail> getGoodsReviewsByGoodsId(Integer goodsId);
  
  /**
   * 插入商品评价
   * @param reviewDetail 商品评价信息
   */
	 void insertGoodsReviewDetail(GoodsReviewDetail reviewDetail);

}
