package com.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the scene_type database table.
 * 
 */
@Entity
@Table(name="scene_type")
@NamedQuery(name="SceneType.findAll", query="SELECT s FROM SceneType s")
public class SceneType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="scene_type_id")
	private int sceneTypeId;

	@Column(name="scene_id")
	private int sceneId;

	@Column(name="type_id")
	private int typeId;

	public SceneType() {
	}

	public int getSceneTypeId() {
		return this.sceneTypeId;
	}

	public void setSceneTypeId(int sceneTypeId) {
		this.sceneTypeId = sceneTypeId;
	}

	public int getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

}