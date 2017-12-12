package com.favorites.proxy;

import com.favorites.domain.UrlLibrary;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@FeignClient(name = "favorites-base-service")
public interface UrlLibraryRepository {

    @RequestMapping("/url/{count}/{str}")
    List<UrlLibrary> findByCountLessThanAndLogoUrl(@PathVariable("count") int count, @PathVariable("str") String str);

    @RequestMapping("/url/{id}")
    int increaseCountById(@PathVariable("id") Long id);

    @RequestMapping("/url/{id}/{logoUrl}")
    int updateLogoUrlById(@PathVariable("id")Long id, @PathVariable("id") String logoUrl);

    @RequestMapping(value = "/url",method = RequestMethod.POST)
    void save(@RequestBody UrlLibrary urlLibrary);

    @RequestMapping("/urls")
    List<UrlLibrary> findAll();

}