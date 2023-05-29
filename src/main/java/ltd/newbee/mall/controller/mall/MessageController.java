package ltd.newbee.mall.controller.mall;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ltd.newbee.mall.entity.Message;
import ltd.newbee.mall.entity.MessageChat;
import ltd.newbee.mall.entity.MessageSession;
import ltd.newbee.mall.service.MessageService;


@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MessageController {

	@Resource
    private MessageService messageService;
    
    @GetMapping("/msgList")
    @ResponseBody
    public List<Message> findMessage(@RequestParam String userId){
		return messageService.findMessage(userId);
    }
    
    @GetMapping("/msgUnreadCount")
    @ResponseBody
    public int getUnreadMessageCount(@RequestParam String userId){
        return messageService.UnreadMessageCount(userId);
    }
    
    @GetMapping("/sessionList")
    @ResponseBody
    public List<MessageSession> findSession(@RequestParam String userId){
		return messageService.findSession(userId);
    }
    
    @GetMapping("/findChat")
    @ResponseBody
    public List<MessageChat> findChat(
            @RequestParam String userId,
            @RequestParam int hostId
    ) {
        return messageService.findChat(userId, hostId);
    }
    

    
}