package ltd.newbee.mall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.entity.Experience;

public interface ExperienceService {

	// get List with filter

	List<Experience> getExperience(Map<String, Object> conditions);

	// get list without filter but recommended
	List<Experience> getPopularExperience(Map<String, Object> conditions);

	List<Experience> getTodayExperience(Map<String, Object> conditions);

	List<Experience> getUniqueExperience(Map<String, Object> conditions);

	List<Experience> getAllExperience(Map<String, Object> conditions);

}
