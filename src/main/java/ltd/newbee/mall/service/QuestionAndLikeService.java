package ltd.newbee.mall.service;

import java.util.List;

import ltd.newbee.mall.entity.QuestionAndLike;

public interface QuestionAndLikeService {
    List<QuestionAndLike> getGoodsQuestionList(int goodsId,String orderBy,int pageNo,int pageSize);
    
    int getGoodsQuestionLikeCount(int goodsId,String questionId);
    int getGoodsQuestionCount(Integer goodsId);

	
}
