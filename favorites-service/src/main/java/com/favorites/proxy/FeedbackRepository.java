package com.favorites.proxy;

import com.favorites.domain.Feedback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;

/**
 * Created by chenzhimin on 2017/2/23.
 */

@Service
@FeignClient(name = "favorites-base-service")
public interface FeedbackRepository {
    void save(Feedback feedback);
}
