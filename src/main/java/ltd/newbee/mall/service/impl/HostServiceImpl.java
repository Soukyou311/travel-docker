package ltd.newbee.mall.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.dao.HostMapper;
import ltd.newbee.mall.entity.Host;
import ltd.newbee.mall.service.HostService;

@Service
public class HostServiceImpl implements HostService {
	@Autowired
	HostMapper hostMapper;
	@Override
	public List<Host>  findHost(int hotelId) {
		 
        return hostMapper.findHost(hotelId);
    }

}
