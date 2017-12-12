package com.favorites.domain;

import java.io.Serializable;

/**
 * 点赞
 * 
 * @author DingYS
 * 
 */

public class Praise extends Entitys implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long collectId;

	private Long userId;

	private Long createTime;

	public Praise() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCollectId() {
		return collectId;
	}

	public void setCollectId(Long collectId) {
		this.collectId = collectId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

}