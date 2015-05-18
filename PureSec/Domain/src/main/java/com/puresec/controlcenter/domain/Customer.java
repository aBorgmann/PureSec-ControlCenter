/**
 * 
 */
package com.puresec.controlcenter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author alken.borgmann
 *
 */
@Entity
public class Customer extends BaseEntity<Long> {
	/**
	 * The url of the security system.
	 */
	@Column(name = "URL")
	private String url = null;

	/**
	 * The name of the customer.
	 */
	@Column(name = "Name")
	private String name = null;

	/**
	 * Constructor.
	 * 
	 * @param url
	 *            The url of the customer.
	 * @param name
	 *            The name of the customer.
	 */
	public Customer(String url, String name) {
		this.name = name;
		this.url = url;
	}

	/**
	 * Gets the Url.
	 * 
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the Url.
	 * 
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
