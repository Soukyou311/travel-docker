package ltd.newbee.mall.controller.common;
import ltd.newbee.mall.entity.FavoriteAlter;
import ltd.newbee.mall.service.FavoriteAlterService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins ="http://localhost:3000")

@RestController
@RequestMapping("/favorite")
public class FavoriteAlterController {

    @Autowired
    private FavoriteAlterService favoriteAlterService;
    
    @GetMapping("/list")
    @ResponseBody
    public List<FavoriteAlter> findFavorite(@RequestParam int userId){
		return favoriteAlterService.findFavorite(userId);
    }
    @GetMapping("/allList")
    @ResponseBody
    public List<FavoriteAlter> findAllFavorite(@RequestParam int userId){
		return favoriteAlterService.findAllFavorite(userId);
    }
  //add some comments for test

	/**
	 * 添加
	 */
	@PostMapping("/insert")
	public ResponseEntity<String> addNewFavorite(@RequestBody FavoriteAlter favoriteAlter) {
		try {
			favoriteAlterService.addNewFavorite(favoriteAlter);
			return new ResponseEntity<>("New Review Saved", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

   
}