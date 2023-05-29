package ltd.newbee.mall.service;

import java.util.List;

import ltd.newbee.mall.entity.Message;
import ltd.newbee.mall.entity.MessageChat;
import ltd.newbee.mall.entity.MessageSession;

public interface MessageService {
	List<Message>  findMessage (String userId);

	int UnreadMessageCount(String userId);

	List<MessageSession> findSession(String userId);


	List<MessageChat> findChat(String userId, int hostId);

	




}
