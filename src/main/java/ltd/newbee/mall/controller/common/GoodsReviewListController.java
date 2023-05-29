package ltd.newbee.mall.controller.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ltd.newbee.mall.entity.GoodsReviewList;
import ltd.newbee.mall.service.GoodsReviewListService;
import ltd.newbee.mall.util.PageResult;

@RestController
public class GoodsReviewListController {
	
	@Autowired
	private GoodsReviewListService goodsReviewListService;


	@GetMapping("/goods/review")
	public Map<String, Object> getGoodsReviewList(@RequestParam(name = "pageNo", defaultValue = "1") int pageNo,
				@RequestParam(name = "goodsId") int goodsId,
				@RequestParam(name = "sortCol", defaultValue = "reviewDate") String orderBy, 
				String reviewId) {

			int pageSize = 100;
			List<GoodsReviewList> reviewList = goodsReviewListService.getGoodsReviewList(goodsId, orderBy, pageNo,
					pageSize);
			int starCount = goodsReviewListService.getGoodsReviewStarCount(goodsId);
			int starGrade = goodsReviewListService.getGoodsReviewStarGrade(goodsId);
			int contextCount = goodsReviewListService.getGoodsReviewContextCount(goodsId);
			float result = (float) starGrade / starCount; // 将整数类型转换为浮点数类型，并进行除法运算
		

			PageResult pageResult = new PageResult(reviewList, starCount, pageSize, pageNo);

			Map<String, Object> resultMap = new HashMap<>();
			resultMap.put("currentPage", pageNo);
			resultMap.put("totalPage", pageResult.getTotalPage());
			resultMap.put("numberOfstarReview", starCount);
			resultMap.put("numberOfstarGrade", String.format("%.1f", result)); 
			resultMap.put("questionList", reviewList);
			resultMap.put("numberOfContextReview", contextCount);
			

		


			return resultMap;

	}
}
