package ltd.newbee.mall.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;
import ltd.newbee.mall.entity.Notice;

public interface NoticeMapper {
	List<Notice> findNotice(@Param("userId") String userId);
}