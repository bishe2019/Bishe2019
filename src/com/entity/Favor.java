package com.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the favor database table.
 * 
 */
@Entity
@NamedQuery(name="Favor.findAll", query="SELECT f FROM Favor f")
public class Favor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="favor_id")
	private int favorId;

	@Column(name="scene_id")
	private int sceneId;

	@Column(name="type_id")
	private int typeId;

	@Column(name="user_id")
	private int userId;

	public Favor() {
	}

	public int getFavorId() {
		return this.favorId;
	}

	public void setFavorId(int favorId) {
		this.favorId = favorId;
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

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}