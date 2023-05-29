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
import ltd.newbee.mall.entity.Notice;
import ltd.newbee.mall.service.MessageService;
import ltd.newbee.mall.service.NoticeService;


@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api")
public class NoticeController {

	@Resource
    private NoticeService noticeService;
    

    
    @GetMapping("/informList")
    @ResponseBody
    public List<Notice> Inform(@RequestParam String userId){
		return  noticeService.Inform(userId);
    }
    
    @GetMapping("/informUnreadCount")
    @ResponseBody
    public int UnreadInformCount(@RequestParam String userId){
		return  noticeService.UnreadInformCount(userId);
    }
    

    
}