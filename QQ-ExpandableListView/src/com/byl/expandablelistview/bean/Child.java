package com.byl.expandablelistview.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Child implements Serializable{
	private String username;//�û���
	private String headphoto;//�û�ͷ��
	private String mood;//����
	private String online_status;//����״̬
	
	
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