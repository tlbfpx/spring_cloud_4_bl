package com.favorites.proxy;

import com.favorites.domain.Praise;
import com.favorites.domain.view.CommentView;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient(name = "favorites-base-service")
public interface PraiseRepository  {


	Long countByCollectId(Long collectId);
	
	Praise findByUserIdAndCollectId(Long userId, Long collectId);
	
    CommentView findPraiseUser(Long id);

	void save(Praise praise);
	void delete(Long id);
	void update(Praise praise);
	
}