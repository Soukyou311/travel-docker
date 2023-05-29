package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.FavoriteAlter;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FavoriteAlterMapper {
	//get favorite list
    List<FavoriteAlter> findFavorite(int userId);
	//get favorite allList
    List<FavoriteAlter> findAllFavorite(int userId);
//insert new list
    void insertFavorite(FavoriteAlter favoriteAlter);

    int deleteFavorite(FavoriteAlter favoriteAlter);
}
//add some comments for test