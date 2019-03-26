package com.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the administrator database table.
 * 
 */
@Entity
@NamedQuery(name="Administrator.findAll", query="SELECT a FROM Administrator a")
public class Administrator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="administrator_id")
	private int administratorId;

	@Column(name="administrator_email")
	private String administratorEmail;

	@Column(name="administrator_name")
	private String administratorName;

	@Column(name="administrator_password")
	private String administratorPassword;

	public Administrator() {
	}

	public int getAdministratorId() {
		return this.administratorId;
	}

	public void setAdministratorId(int administratorId) {
		this.administratorId = administratorId;
	}

	public String getAdministratorEmail() {
		return this.administratorEmail;
	}

	public void setAdministratorEmail(String administratorEmail) {
		this.administratorEmail = administratorEmail;
	}

	public String getAdministratorName() {
		return this.administratorName;
	}

	public void setAdministratorName(String administratorName) {
		this.administratorName = administratorName;
	}

	public String getAdministratorPassword() {
		return this.administratorPassword;
	}

	public void setAdministratorPassword(String administratorPassword) {
		this.administratorPassword = administratorPassword;
	}

}