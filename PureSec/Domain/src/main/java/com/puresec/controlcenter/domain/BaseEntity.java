/**
 * 
 */
package com.puresec.controlcenter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author alken.borgmann
 *
 */
@Entity
public class BaseEntity<ID_TYPE> {

	/**
	 * The unique identifier
	 */
	@Id
	@Column(name = "ID")
	protected ID_TYPE id;

	/**
	 * @return the id
	 */
	public ID_TYPE getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(ID_TYPE id) {
		this.id = id;
	}
}
