package com.entity;

public class Params {

	//景点名
	private String sceneName;
	//景点类型
	private Integer sceneType;
	//用户邮箱
	private String email;
	//用户密码
	private String password;
	
	public String getSceneName() {
		return sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}
	public Integer getSceneType() {
		return sceneType;
	}
	public void setSceneType(Integer sceneType) {
		this.sceneType = sceneType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
