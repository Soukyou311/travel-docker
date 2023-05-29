package ltd.newbee.mall.controller.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ltd.newbee.mall.entity.QuestionAndLike;
import ltd.newbee.mall.service.QuestionAndLikeService;
import ltd.newbee.mall.util.PageResult;

@RestController
public class QuestionAndLikeController {

	@Autowired
	private QuestionAndLikeService questionAndLikeService;


	@GetMapping("/qa/page")
	public Map<String, Object> getGoodsQuestionList(@RequestParam(name = "pageNo", defaultValue = "1") int pageNo,
				@RequestParam(name = "goodsId") int goodsId,
				@RequestParam(name = "sortCol", defaultValue = "questionDate") String orderBy, 
				String questionId) {

			int pageSize = 3;
			List<QuestionAndLike> questionList = questionAndLikeService.getGoodsQuestionList(goodsId, orderBy, pageNo,
					pageSize);
			int totalCount = questionAndLikeService.getGoodsQuestionCount(goodsId);

			PageResult pageResult = new PageResult(questionList, totalCount, pageSize, pageNo);

			Map<String, Object> resultMap = new HashMap<>();
			resultMap.put("currentPage", pageNo);
			resultMap.put("totalPage", pageResult.getTotalPage());
			resultMap.put("questionList", questionList);
			return resultMap;

	}

	}


