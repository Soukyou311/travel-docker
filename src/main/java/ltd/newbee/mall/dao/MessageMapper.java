package ltd.newbee.mall.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;
import ltd.newbee.mall.entity.Message;
import ltd.newbee.mall.entity.MessageChat;
import ltd.newbee.mall.entity.MessageSession;



public interface MessageMapper {
	List<Message> findMessage(@Param("userId") String userId);
	List<MessageSession> findSession(@Param("userId") String userId);
	List<MessageChat> findChat(@Param("userId") String userId,@Param("hostId") int hostId);
	
}