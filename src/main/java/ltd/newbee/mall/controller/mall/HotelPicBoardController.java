package ltd.newbee.mall.controller.mall;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ltd.newbee.mall.entity.HotelPicBoard;
import ltd.newbee.mall.service.HotelPicBoardService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/hotelimg")
public class HotelPicBoardController {
    
    @Autowired
    private HotelPicBoardService hostService;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String REDIS_KEY_PREFIX = "hotelPicBoardList:";

    @GetMapping("/list")
    @ResponseBody
    public List<HotelPicBoard> findHost(@RequestParam int hotelId) {
        String redisKey = REDIS_KEY_PREFIX + hotelId;
        @SuppressWarnings("unchecked")
		List<HotelPicBoard> hotelPicBoardList = (List<HotelPicBoard>) redisTemplate.opsForValue().get(redisKey);
        if (hotelPicBoardList == null) {
            hotelPicBoardList = hostService.findHotelPicBoard(hotelId);
            redisTemplate.opsForValue().set(redisKey, hotelPicBoardList);
            redisTemplate.expire(redisKey, 10, TimeUnit.SECONDS); // 设置10秒过期时间
        }
        return hotelPicBoardList;
    }
    
}