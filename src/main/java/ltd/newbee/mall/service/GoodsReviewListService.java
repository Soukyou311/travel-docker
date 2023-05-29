package ltd.newbee.mall.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.entity.GoodsReviewList;


public interface GoodsReviewListService {
	  List<GoodsReviewList> getGoodsReviewList(int goodsId,String orderBy,int pageNo,int pageSize);
	    
	    int getGoodsReviewListLikeCount(int goodsId,String reviewId);
	    int getGoodsReviewStarCount(Integer goodsId);
	    int getGoodsReviewStarGrade(Integer goodsId);
	    int getGoodsReviewContextCount(@Param("contextCount") Integer contextCount);



}
