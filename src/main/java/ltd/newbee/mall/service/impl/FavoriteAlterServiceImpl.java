package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.FavoriteAlterMapper;
import ltd.newbee.mall.entity.FavoriteAlter;
import ltd.newbee.mall.service.FavoriteAlterService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteAlterServiceImpl implements FavoriteAlterService {

    @Autowired
    private FavoriteAlterMapper favoriteAlterMapper;

    public List<FavoriteAlter> findFavorite(int userId) {
        return favoriteAlterMapper.findFavorite(userId);
    }
    public List<FavoriteAlter> findAllFavorite(int userId) {
        return favoriteAlterMapper.findAllFavorite(userId);
    }

    @Override
    public void addNewFavorite(FavoriteAlter favoriteAlter) {
    	favoriteAlterMapper.insertFavorite(favoriteAlter);
    }
  //add some comments for test

    @Override
    public int deleteFavorite(FavoriteAlter favoriteAlter) {
        return favoriteAlterMapper.deleteFavorite(favoriteAlter);
    }
}