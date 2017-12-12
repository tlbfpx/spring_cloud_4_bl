package com.favorites.proxy;

import com.favorites.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name = "favorites-base-service")
public interface UserRepository {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
    
    User findByEmail(String email);
    
    int setOutDateAndValidataCode(@RequestParam("outDate") String outDate, @RequestParam("validataCode") String validataCode, @RequestParam("email") String email);
    
     int setNewPassword(@RequestParam("passWord") String passWord, @RequestParam("email") String email);
    
     int setIntroduction(@RequestParam("introduction") String introduction, @RequestParam("email") String email);
    
     int setUserName(@RequestParam("userName") String userName, @RequestParam("email") String email);
    
    int setProfilePicture(@RequestParam("profilePicture") String profilePicture, @RequestParam("id") Long id);

    int setBackgroundPicture(@RequestParam("backgroundPicture") String backgroundPicture, @RequestParam("id") Long id);

    @RequestMapping("/user/{id}")
    User findById(@RequestParam("id") Long id);

    User findOne(Long id);
}