package ltd.newbee.mall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.entity.Experience;

public interface ExperienceMapper {

	/**
	 * filter查找
	 * 
	 */
	List<Experience> findExperience(Map<String, Object> conditions);

	/**
	 * 默认首页推荐 四个方法
	 */
	List<Experience> findPopularExperience(Map<String, Object> conditions);

	List<Experience> findTodayExperience(Map<String, Object> conditions);

	List<Experience> findUniqueExperience(Map<String, Object> conditions);

	List<Experience> findAllExperience(Map<String, Object> conditions);

}