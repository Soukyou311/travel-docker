package ltd.newbee.mall.service.impl;

import java.util.List;
import ltd.newbee.mall.dao.FilterUnitMapper;
import ltd.newbee.mall.entity.FilterUnit;
import ltd.newbee.mall.service.FilterUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilterUnitServiceImpl implements FilterUnitService {

  @Autowired
  private FilterUnitMapper filterUnitMapper;

  @Override
  public List<FilterUnit> getFilterUnit(String parentId) {
    List<FilterUnit> list = filterUnitMapper.findFilterUnit(parentId);
    return list;
  }


}
