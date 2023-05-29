package ltd.newbee.mall.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ltd.newbee.mall.dao.NoticeMapper;
import ltd.newbee.mall.entity.Notice;
import ltd.newbee.mall.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	NoticeMapper noticeMapper;
	
	
	
	@Override
	public List<Notice> Inform(String userId) {
	    List<Notice> inform = noticeMapper.findNotice(userId);
	    return inform;
	}
	
	
	@Override
    public int UnreadInformCount(String userId) {
		List<Notice> inform = noticeMapper.findNotice(userId);
        int unreadInformCount = 0;
        for (Notice notice : inform) {
            if (notice.getIsRead() == 0) {
                unreadInformCount++;
            }
        }

        return unreadInformCount;
    }
	

	
}
