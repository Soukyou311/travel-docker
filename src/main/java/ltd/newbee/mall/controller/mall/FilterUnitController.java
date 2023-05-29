package ltd.newbee.mall.controller.mall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ltd.newbee.mall.entity.FilterUnit;
import ltd.newbee.mall.service.FilterUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins ="http://localhost:3000")
@RestController
public class FilterUnitController {
@Autowired
private FilterUnitService filterUnitService;


  @GetMapping("/unit")
  @ResponseBody
  private List<FilterUnit> getFilterUnit(@RequestParam String parentId) {

    List<FilterUnit> UnitFilters = filterUnitService.getFilterUnit(parentId);
    return UnitFilters;
  }


}
