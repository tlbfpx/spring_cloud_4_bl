package com.favorites.repository;

import com.favorites.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;

@RepositoryRestResource(path="user",collectionResourceRel = "user")
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(@Param("username") String userName);

    User findByUserNameOrEmail(@Param("username")String username, @Param("email") String email);

    User findByEmail(@Param("email") String email);
    
    @Modifying(clearAutomatically=true)
    @Transactional
    @Query("update User set outDate=:outDate, validataCode=:validataCode where email=:email") 
    int setOutDateAndValidataCode(@Param("outDate") String outDate, @Param("validataCode") String validataCode, @Param("email") String email);
    
    @Modifying(clearAutomatically=true)
    @Transactional
    @Query("update User set passWord=:passWord where email=:email") 
    int setNewPassword(@Param("passWord") String passWord, @Param("email") String email);
    
    @Modifying(clearAutomatically=true)
    @Transactional
    @Query("update User set introduction=:introduction where email=:email") 
    int setIntroduction(@Param("introduction") String introduction, @Param("email") String email);
    
    @Modifying(clearAutomatically=true)
    @Transactional
    @Query("update User set userName=:userName where email=:email") 
    int setUserName(@Param("userName") String userName, @Param("email") String email);
    
    @Modifying(clearAutomatically=true)
    @Transactional
    @Query("update User set profilePicture=:profilePicture where id=:id") 
    int setProfilePicture(@Param("profilePicture") String profilePicture, @Param("id") Long id);

//    @Query("from User u where u.name=:name")
//    User findUser(@Param("name") String name);

    @Modifying(clearAutomatically=true)
    @Transactional
    @Query("update User set backgroundPicture=:backgroundPicture where id=:id")
    int setBackgroundPicture(@Param("backgroundPicture") String backgroundPicture, @Param("id") Long id);
    User findById(@Param("id") Long id);
}