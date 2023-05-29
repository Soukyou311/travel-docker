package ltd.newbee.mall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.entity.GoodsReviewList;


public interface GoodsReviewListMapper {
	List<GoodsReviewList> getGoodsReviewList(@Param("goodsId") int goodsId, @Param("orderBy") String orderBy,
			 int pageNo, @Param("pageSize") int pageSize);

	int getGoodsReviewListLikeCount(int goodsId, String reviewId);
	
	int getGoodsReviewStarCount(@Param("goodsId") Integer goodsId);
	int getGoodsReviewStarGrade(@Param("goodsId") Integer goodsId);
	int getGoodsReviewContextCount(@Param("goodsId") Integer goodsId);

}
