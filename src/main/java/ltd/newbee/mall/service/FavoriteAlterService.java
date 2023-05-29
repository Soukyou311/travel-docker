package ltd.newbee.mall.service;

import java.util.List;

import ltd.newbee.mall.entity.FavoriteAlter;

public interface FavoriteAlterService {
    List<FavoriteAlter> findFavorite(int userId);
    List<FavoriteAlter> findAllFavorite(int userId);

    void addNewFavorite(FavoriteAlter favoriteAlter);

    int deleteFavorite(FavoriteAlter favoriteAlter);
}
//add some comments for test