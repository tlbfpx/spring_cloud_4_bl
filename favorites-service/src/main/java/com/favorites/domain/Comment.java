package com.favorites.domain;

import java.io.Serializable;

/**
 * 评论
 * 
 * @author DingYS
 * 
 */

public class Comment extends Entitys implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long collectId;

	private String content;

	private Long userId;

	private Long replyUserId;

	private Long createTime;

	private String commentTime;

	private String userName;

	private String replyUserName;
	
	private String profilePicture;

	public Comment() {
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getReplyUserId() {
		return replyUserId;
	}

	public void setReplyUserId(Long replyUserId) {
		this.replyUserId = replyUserId;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

  public String getReplyUserName() {
    return replyUserName;
  }

  public void setReplyUserName(String replyUserName) {
    this.replyUserName = replyUserName;
  }

}