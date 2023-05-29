package ltd.newbee.mall.dao;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.entity.QuestionAndLike;

@Mapper
public interface QuestionAndLikeMapper {

	List<QuestionAndLike> getGoodsQuestionList(@Param("goodsId") int goodsId, @Param("orderBy") String orderBy,
			@Param("offset") int offset, @Param("pageSize") int pageSize);

	int getGoodsQuestionLikeCount(int goodsId, String questionId);
	int getGoodsQuestionCount(@Param("goodsId") Integer goodsId);
}
