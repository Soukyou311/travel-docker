package ltd.newbee.mall.service;

import java.util.List;

import ltd.newbee.mall.entity.Message;
import ltd.newbee.mall.entity.Notice;

public interface NoticeService {

	List<Notice> Inform(String userId);

	int UnreadInformCount(String userId);


}
