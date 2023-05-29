package ltd.newbee.mall.dao;

import java.util.List;
import java.util.Map;
import ltd.newbee.mall.entity.FilterUnit;

public interface FilterUnitMapper {
  List<FilterUnit> findFilterUnit(String parentId);



}
