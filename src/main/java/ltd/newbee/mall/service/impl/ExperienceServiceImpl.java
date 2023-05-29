package ltd.newbee.mall.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.dao.ExperienceMapper;
import ltd.newbee.mall.entity.Experience;
import ltd.newbee.mall.service.ExperienceService;

@Service
public class ExperienceServiceImpl implements ExperienceService {
	@Autowired
	private ExperienceMapper experienceMapper;

	// get list
	@Override
	public List<Experience> getExperience(Map<String, Object> conditions) {
		List<Experience> list = experienceMapper.findExperience(conditions);
		return list;
	}

	@Override
	public List<Experience> getPopularExperience(Map<String, Object> conditions) {

		List<Experience> popList = experienceMapper.findPopularExperience(conditions);
		return popList;
	}

	@Override
	public List<Experience> getTodayExperience(Map<String, Object> conditions) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(new Date());
		conditions.put("today", today);
		List<Experience> list = experienceMapper.findTodayExperience(conditions);

		return list;
	}

	@Override
	public List<Experience> getUniqueExperience(Map<String, Object> conditions) {
		List<Experience> list = experienceMapper.findUniqueExperience(conditions);
		return list;
	}

	@Override
	public List<Experience> getAllExperience(Map<String, Object> conditions) {
		List<Experience> list = experienceMapper.findAllExperience(conditions);
		return list;
	}

}
