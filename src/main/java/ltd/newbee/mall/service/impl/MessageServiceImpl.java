package ltd.newbee.mall.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ltd.newbee.mall.dao.MessageMapper;
import ltd.newbee.mall.entity.Message;
import ltd.newbee.mall.entity.MessageChat;
import ltd.newbee.mall.entity.MessageSession;
import ltd.newbee.mall.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	MessageMapper messageMapper;
	
	
	@Override
	public List<Message> findMessage(String userId) {
		List<Message> messages = messageMapper.findMessage(userId);
        return messages;
	}
	
	
	@Override
    public int UnreadMessageCount(String userId) {
        List<Message> messages = messageMapper.findMessage(userId);
        int unreadMessageCount = 0;
        for (Message message : messages) {
            if (!message.getSendFrom().equals(userId) && message.getIsRead() == 0) {
            	unreadMessageCount++;
            }
        }

        return unreadMessageCount;
    }
	
	@Override
	public List<MessageSession> findSession(String userId) {
		List <MessageSession> session = messageMapper.findSession(userId);
        return session;
	}


	@Override
	public List<MessageChat> findChat(String userId, int hostId) {
		List <MessageChat> Chat = messageMapper.findChat(userId,hostId);
		return Chat;
	}
	
	
	
	
	
}
