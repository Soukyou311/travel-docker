package ltd.newbee.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.dao.GoodsReviewListMapper;
import ltd.newbee.mall.entity.GoodsReviewList;
import ltd.newbee.mall.service.GoodsReviewListService;


@Service
public class GoodsReviewListServiceimpl implements  GoodsReviewListService{
	
	@Autowired
    private final GoodsReviewListMapper goodsReviewListMapper;

    public GoodsReviewListServiceimpl(GoodsReviewListMapper goodsReviewListMapper) {
        this.goodsReviewListMapper = goodsReviewListMapper;
    }

    @Override
    public List<GoodsReviewList> getGoodsReviewList(int goodsId, String orderBy, int pageNo, int pageSize) {
 
        return goodsReviewListMapper.getGoodsReviewList(goodsId, orderBy, pageNo, pageSize);
    }

    @Override
    public int getGoodsReviewListLikeCount(int goodsId, String reviewId) {
        return goodsReviewListMapper.getGoodsReviewListLikeCount(goodsId, reviewId);
    }
    
    @Override
    public int getGoodsReviewStarCount(Integer goodsId) {
        return goodsReviewListMapper.getGoodsReviewStarCount(goodsId);
    }
    
    @Override
    public int getGoodsReviewStarGrade(Integer goodsId) {
        return goodsReviewListMapper.getGoodsReviewStarGrade(goodsId);
    }
    
    @Override
    public int getGoodsReviewContextCount(Integer contextCount) {
        return goodsReviewListMapper.getGoodsReviewContextCount(contextCount);
    }
    
    


}
