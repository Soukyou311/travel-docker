package ltd.newbee.mall.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.dao.IndexConfigMapper;
import ltd.newbee.mall.entity.FindRecommendGoods;
import ltd.newbee.mall.service.FindRecommendGoodsService;

@Service
public class FindRecommendGoodsServiceImpl implements FindRecommendGoodsService {
    private IndexConfigMapper findRecommendGoods;

    @Autowired
    public FindRecommendGoodsServiceImpl(IndexConfigMapper findRecommendGoods) {
        this.findRecommendGoods = findRecommendGoods;
    }

    @Override
    public List<FindRecommendGoods> findRecommendGoods(Integer type, String orderBy, Integer limit) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("type", type);
        paramMap.put("orderBy", orderBy);
        paramMap.put("limit", limit);
        return findRecommendGoods.findRecommendGoods(paramMap);
    }
}
