package com.favorites.repository;

import com.favorites.domain.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by chenzhimin on 2017/2/23.
 */

@RepositoryRestResource(path="feedback",collectionResourceRel = "feedback")
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
