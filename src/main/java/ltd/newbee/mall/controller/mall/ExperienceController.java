package ltd.newbee.mall.controller.mall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ltd.newbee.mall.entity.Experience;
import ltd.newbee.mall.service.ExperienceService;
import ltd.newbee.mall.util.PageResult;

@RestController
public class ExperienceController {

	@Autowired
	private ExperienceService experienceService;

	// 请求映射
	@PostMapping("/experience")
	public List<Experience> getExperience(@RequestBody Map<String, Object> conditions) {
		return experienceService.getExperience(conditions);
	}

	@PostMapping("/popular")
	@ResponseBody
	private PageResult getPopularExperience(@RequestParam(required = false, defaultValue = "1") Integer currPage,
			Map<String, Object> conditions) {

		List<Experience> popExperiences = experienceService.getPopularExperience(conditions);
		int totalExperiences = popExperiences.size();
		int PageSize = 7;
		PageResult pageResult = new PageResult(popExperiences, totalExperiences, PageSize, currPage);
		return pageResult;

	}

	@PostMapping("/today")
	@ResponseBody
	private PageResult getTodayExperience(@RequestParam(required = false, defaultValue = "1") Integer currPage,
			Map<String, Object> conditions) {
		int pageSize = 5;
		int totalTodayExperiences = experienceService.getTodayExperience(conditions).size();
		List<Experience> todayList = experienceService.getTodayExperience(conditions);
		PageResult pageResult = new PageResult(todayList, totalTodayExperiences, pageSize, currPage);
		return pageResult;
	}

	@PostMapping("/unique")
	@ResponseBody
	private PageResult getUniqueExperience(@RequestParam(required = false, defaultValue = "1") Integer currPage,
			Map<String, Object> conditions) {

		int pageSize = 5;

		List<Experience> uniqueList = experienceService.getUniqueExperience(conditions);

		int totalUniqueExperiences = experienceService.getUniqueExperience(conditions).size();
		PageResult pageResult = new PageResult(uniqueList, totalUniqueExperiences, pageSize, currPage);
		return pageResult;
	}

	@PostMapping("/all")
	@ResponseBody
	private List<Experience> getAllExperience(Map<String, Object> conditions) {
		if (conditions == null || conditions.isEmpty()) {
			// Set default values for conditions
			conditions = new HashMap<>();
			conditions.put("currPage", "1");
		}
		List<Experience> allList = experienceService.getAllExperience(conditions);
		return allList;
	}

}
