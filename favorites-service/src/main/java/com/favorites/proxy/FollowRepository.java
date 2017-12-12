package com.favorites.proxy;

import com.favorites.domain.Follow;
import com.favorites.domain.enums.FollowStatus;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@FeignClient(name = "favorites-base-service")
public interface FollowRepository   {

	List<String> findByUserId(@RequestParam("userId") Long userId);
	
	List<Long> findMyFollowIdByUserId(@RequestParam("userId") Long userId);
	
	Integer countByUserIdAndStatus(Long userId, FollowStatus status);

	Integer countByFollowIdAndStatus(Long followId, FollowStatus status);

	List<String> findFollowUserByUserId(@RequestParam("userId") Long userId);

	List<String> findFollowedUserByFollowId(@RequestParam("followId") Long followId);

	Integer countByUserIdAndFollowIdAndStatus(Long userId, Long followId, FollowStatus status);

	Follow findByUserIdAndFollowId(Long userId, Long followId);

	Integer updateStatusById(FollowStatus status, Long lastModifyTime, Long id);

}