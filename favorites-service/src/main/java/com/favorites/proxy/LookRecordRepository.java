package com.favorites.proxy;

import com.favorites.domain.LookRecord;
import com.favorites.domain.view.CollectView;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 浏览记录Repository
 * Created by chenzhimin on 2017/1/5.
 */
@Service
@FeignClient(name = "favorites-base-service")
public interface LookRecordRepository  {

    void save(LookRecord lookRecord);
    Page<CollectView> findViewByUserId(Long userId, Pageable pageable);

    Integer countByUserIdAndCollectId(Long userId, Long collectId);

    void updatelastModifyTime(@RequestParam("userId") Long userId, @RequestParam("collectId") Long collectId, @RequestParam("lastModifyTime") Long lastModifyTime);


    Long deleteByUserIdAndCollectId(Long userId, Long collectId);


    Long deleteByUserId(Long userId);
}
