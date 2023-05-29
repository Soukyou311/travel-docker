package ltd.newbee.mall.controller.common;

import java.util.List;

import ltd.newbee.mall.entity.FindRecommendGoods;
import ltd.newbee.mall.service.FindRecommendGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindRecommendGoodsController {

	@Autowired
	private final FindRecommendGoodsService findRecommendGoodsService;

	public FindRecommendGoodsController(FindRecommendGoodsService findRecommendGoodsService) {
		this.findRecommendGoodsService = findRecommendGoodsService;
	}

	@GetMapping("/recommend_goods")
	@ResponseBody
	public List<FindRecommendGoods> findRecommendGoods(
		@RequestParam(defaultValue = "10") Integer limit,
		@RequestParam(defaultValue ="3") Integer type,
		@RequestParam(defaultValue = "false") String orderBy) {
		return findRecommendGoodsService.findRecommendGoods(type, orderBy,limit);
	}
}