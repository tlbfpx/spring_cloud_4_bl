package com.bailian.service.product.dao;


import com.bailian.service.product.model.User;
import com.bailian.service.product.util.BaseMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

/**
 * @author TLB17
 */

@CacheConfig(cacheNames = "users")
public interface UserMapper extends BaseMapper<User> {

    @Cacheable(key="caches[0].name + '_' +  #p0")
    User getById(Integer id);
}
