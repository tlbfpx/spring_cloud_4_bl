package com.favorites.proxy;

import com.favorites.domain.Letter;
import com.favorites.domain.view.LetterView;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DingYS on 2017/3/7.
 */
@Service
@FeignClient(name = "favorites-base-service")
public interface LetterRepository  {

    void save(Letter letter);

    int updatePidById(Long id, Long pid);

    List<LetterView> findLetterByReceiveUserId(Long userId, Pageable pageable);

}
