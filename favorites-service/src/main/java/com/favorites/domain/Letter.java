package com.favorites.domain;

import com.favorites.domain.enums.LetterType;

import java.io.Serializable;

/**
 * 私信
 * 
 * @author DingYS
 * 
 */

public class Letter extends Entitys implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long sendUserId;

	private String content;

	private Long receiveUserId;

	private Long pid;

	private LetterType type;

	private Long createTime;

	private String sendType;


	public Letter() {
		super();
	}

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSendUserId() {
		return sendUserId;
	}

	public void setSendUserId(Long sendUserId) {
		this.sendUserId = sendUserId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getReceiveUserId() {
		return receiveUserId;
	}

	public void setReceiveUserId(Long receiveUserId) {
		this.receiveUserId = receiveUserId;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public LetterType getType() {
		return type;
	}

	public void setType(LetterType type) {
		this.type = type;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
}