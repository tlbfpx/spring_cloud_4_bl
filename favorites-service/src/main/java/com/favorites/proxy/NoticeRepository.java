package com.favorites.proxy;

import com.favorites.domain.Notice;
import com.favorites.domain.view.CollectView;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
@Service
@FeignClient(name = "favorites-base-service")
public interface NoticeRepository  {

    void save(Notice notice);
    Page<CollectView> findViewByUserIdAndType(Long userId, String type, Pageable pageable);

	Long countByUserIdAndTypeAndReaded(Long userId, String type, String readed);

	Long countPraiseByUserIdAndReaded(Long userId, String readed);
	
    int updateReadedByUserId(String readed, long userId, String type);

}