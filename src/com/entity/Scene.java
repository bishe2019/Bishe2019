package com.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the scene database table.
 * 
 */
@Entity
@NamedQuery(name="Scene.findAll", query="SELECT s FROM Scene s")
public class Scene implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="scene_id")
	private int sceneId;

	@Column(name="scene_name")
	private String sceneName;

	@Column(name="scene_pic")
	private String scenePic;

	@Column(name="scene_sumamry")
	private String sceneSumamry;

	@Column(name="scene_type")
	private int sceneType;

	public Scene() {
	}

	public int getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}

	public String getSceneName() {
		return this.sceneName;
	}

	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getScenePic() {
		return this.scenePic;
	}

	public void setScenePic(String scenePic) {
		this.scenePic = scenePic;
	}

	public String getSceneSumamry() {
		return this.sceneSumamry;
	}

	public void setSceneSumamry(String sceneSumamry) {
		this.sceneSumamry = sceneSumamry;
	}

	public int getSceneType() {
		return this.sceneType;
	}

	public void setSceneType(int sceneType) {
		this.sceneType = sceneType;
	}

}