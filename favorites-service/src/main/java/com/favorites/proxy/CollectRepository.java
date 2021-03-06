package com.favorites.proxy;

import com.favorites.domain.Collect;
import com.favorites.domain.enums.CollectType;
import com.favorites.domain.enums.IsDelete;
import com.favorites.domain.view.CollectView;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FeignClient(name = "favorites-base-service")
public interface CollectRepository {


    Page<CollectView> findExploreViewByCategory(String category, Pageable pageable);


    Page<CollectView> findExploreViewByType(Pageable pageable);


    Long countByUserIdAndIsDelete(Long userId, IsDelete isDelete);

    Long countByUserIdAndTypeAndIsDelete(Long userId, CollectType type, IsDelete isDelete);

    Collect findByIdAndUserId(Long id, Long userId);


    Long deleteById(Long id);

    Page<Collect> findByFavoritesIdAndIsDelete(Long favoritesId, Pageable pageable, IsDelete isDelete);

    List<Collect> findByFavoritesIdAndIsDelete(Long favoritesId, IsDelete isDelete);

    List<Collect> findByFavoritesIdAndUrlAndUserIdAndIsDelete(Long favoritesId, String url, Long userId, IsDelete isDelete);


    int modifyByIdAndUserId(CollectType type, Long id, Long userId);


    void deleteByFavoritesId(Long favoritesId);


    Page<CollectView> findViewByUserId(Long userId, Pageable pageable);


    Page<CollectView> findViewByUserIdAndIsDelete(Long userId, Pageable pageable);


    Page<CollectView> findViewByUserIdAndType(Long userId, Pageable pageable, CollectType type);


    Page<CollectView> findViewByUserIdAndTypeAndFavoritesId(Long userId, Pageable pageable, CollectType type, Long favoritesId);


    Page<CollectView> findViewByFavoritesId(Long favoritesId, Pageable pageable);


    Page<CollectView> findExploreView(Long userId, Pageable pageable);


    Page<CollectView> findViewByUserIdAndFollows(Long userId, List<Long> userIds, Pageable pageable);


    Page<CollectView> searchMyByKey(Long userId, String key, Pageable pageable);


    Page<CollectView> searchOtherByKey(Long userId, String key, Pageable pageable);

    Long countByFavoritesIdAndTypeAndIsDelete(Long favoritesId, CollectType type, IsDelete isDelete);

    List<Collect> findByCreateTimeLessThanAndIsDeleteAndFavoritesIdIn(Long createTime, IsDelete isDelete, List<Long> favoritesIds);


    int modifyIsDeleteById(IsDelete isDelete, Long lastModifyTime, Long id);


    int updateLogoUrlByUrl(String logoUrl, Long lastModifyTime, String url);

    List<Collect> findByUserIdAndIsDelete(Long userId, IsDelete isDelete);

    Collect findOne(Long id);

    void save(Collect collect);

}