package com.favorites.proxy;

import com.favorites.domain.Comment;
import com.favorites.domain.view.CommentView;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FeignClient(name = "favorites-base-service")
public interface CommentRepository {

	Long countByCollectId(Long collectId);
	
	List<Comment> findByCollectIdOrderByIdDesc(Long collectId);
	

	Long deleteById(Long id);

	

	CommentView findReplyUser(Long id);
	
}