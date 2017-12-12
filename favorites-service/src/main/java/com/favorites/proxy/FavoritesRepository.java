package com.favorites.proxy;


import com.favorites.domain.Favorites;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@FeignClient(name = "favorites-base-service")
public interface FavoritesRepository   {

	Favorites findOne(Long id);
	void save(Favorites favorites);
	List<Favorites> findByUserId(Long userId);
	
	List<Favorites> findByUserIdOrderByIdDesc(Long userId);
	
	Favorites findByUserIdAndName(Long userId, String name);


	void increaseCountById(@RequestParam("id") Long id, @RequestParam("lastModifyTime") Long lastModifyTime);


	void reduceCountById(@RequestParam("id") Long id, @RequestParam("lastModifyTime") Long lastModifyTime);


	void updateNameById(@RequestParam("id") Long id, @RequestParam("lastModifyTime") Long lastModifyTime, @RequestParam("name") String name);

	List<Long> findIdByName(String name);
}