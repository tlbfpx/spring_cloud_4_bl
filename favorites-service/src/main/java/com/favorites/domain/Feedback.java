package com.favorites.domain;

import java.io.Serializable;

/**
 * 用户反馈javaBean类
 * Created by chenzhimin on 2017/2/23.
 */

public class Feedback  extends Entitys implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long id;

    private Long userId;

    private String feedbackAdvice;

    private String feedbackName;

    private String phone;

    private Long createTime;

    private Long lastModifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFeedbackAdvice() {
        return feedbackAdvice;
    }

    public void setFeedbackAdvice(String feedbackAdvice) {
        this.feedbackAdvice = feedbackAdvice;
    }

    public String getFeedbackName() {
        return feedbackName;
    }

    public void setFeedbackName(String feedbackName) {
        this.feedbackName = feedbackName;
    }
}
