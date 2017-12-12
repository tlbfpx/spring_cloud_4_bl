package com.favorites.proxy;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 获取收藏家
 * @Auth: yuyang
 * @Date: 2017/1/18 19:34
 * @Version: 1.0
 **/


@Service
@FeignClient(name = "favorites-base-service")
public interface CollectorRepository {

    @RequestMapping("/collector")
    Long getMostCollectUser();

    @RequestMapping("/collector/followed/{notUserId}")
    Long getMostFollowedUser(@PathVariable("notUserId") Long notUserId);

    @RequestMapping("/collector/{notUserId}")
    Long getMostPraisedUser(String notUserIds);

    Long getMostCommentedUser(String notUserIds);

    Long getMostPopularUser(String notUserIds);

    Long getMostActiveUser(String notUserIds);

}
