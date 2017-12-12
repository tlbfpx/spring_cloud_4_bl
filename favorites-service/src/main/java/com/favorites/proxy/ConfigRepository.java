package com.favorites.proxy;

import com.favorites.domain.Config;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient(name = "favorites-base-service")
public interface ConfigRepository   {

	void save(Config config);
	Config findOne(Long id);
	Config findByUserId(Long userId);
	
	Config findByUserIdAndDefaultFavorties(Long userId, String defaultFavorites);


	int updateCollectTypeById(Long id, String value, Long lastModifyTime);


	int updateModelTypeById(Long id, String value, Long lastModifyTime);


	int updateFavoritesById(Long id, String value, Long lastModifyTime);
	
}