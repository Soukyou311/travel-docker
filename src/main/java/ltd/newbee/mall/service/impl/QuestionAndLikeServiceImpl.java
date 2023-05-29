package ltd.newbee.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.dao.QuestionAndLikeMapper;
import ltd.newbee.mall.entity.QuestionAndLike;
import ltd.newbee.mall.service.QuestionAndLikeService;

@Service
public class QuestionAndLikeServiceImpl implements QuestionAndLikeService {

	@Autowired
    private final QuestionAndLikeMapper questionAndLikeMapper;

    public QuestionAndLikeServiceImpl(QuestionAndLikeMapper questionAndLikeMapper) {
        this.questionAndLikeMapper = questionAndLikeMapper;
    }

    @Override
    public List<QuestionAndLike> getGoodsQuestionList(int goodsId, String orderBy, int pageNo, int pageSize) {
        int offset = (pageNo - 1) * pageSize;
        return questionAndLikeMapper.getGoodsQuestionList(goodsId, orderBy, offset, pageSize);
    }

    @Override
    public int getGoodsQuestionLikeCount(int goodsId, String questionId) {
        return questionAndLikeMapper.getGoodsQuestionLikeCount(goodsId, questionId);
    }
    
    @Override
    public int getGoodsQuestionCount(Integer goodsId) {
        return questionAndLikeMapper.getGoodsQuestionCount(goodsId);
    }

}
