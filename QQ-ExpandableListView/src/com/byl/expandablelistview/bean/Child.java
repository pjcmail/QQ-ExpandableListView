package com.byl.expandablelistview.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Child implements Serializable{
	private String username;//用户名
	private String headphoto;//用户头像
	private String mood;//心情
	private String online_status;//在线状态
	
	
	public String getMood() {
		return mood;
	}
	public void setMood(String mood) {
		this.mood = mood;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
}
	public String getOnline_status() {
		return online_status;
	}
	public void setOnline_status(String online_status) {
		this.online_status = online_status;
	}
	public String getHeadphoto() {
		return headphoto;
	}
	public void setHeadphoto(String headphoto) {
		this.headphoto = headphoto;
	}
	
}