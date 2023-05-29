package ltd.newbee.mall.controller.mall;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ltd.newbee.mall.entity.Host;
import ltd.newbee.mall.service.HostService;


@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/host")
public class HostController {

	@Resource
    private HostService hostService;
    
    @GetMapping("/list")
    @ResponseBody
    public List<Host> findHost(@RequestParam int hotelId){
		return hostService.findHost(hotelId);
    }
    	
    }