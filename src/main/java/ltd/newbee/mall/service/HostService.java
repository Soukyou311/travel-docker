package ltd.newbee.mall.service;

import java.util.List;

import ltd.newbee.mall.entity.Host;

public interface HostService {
	List<Host>  findHost(int hotelId);
}
