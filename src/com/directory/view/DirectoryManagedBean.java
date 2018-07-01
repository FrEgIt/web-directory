/**
 * DirectoryManagedBean.java
 */
package com.directory.view;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.directory.business.DirectoryLocal;
import com.directory.data.Contact;

/**
 * @author Mohamed ABDELNABI
 *
 */
@ManagedBean(name = "directory")
public class DirectoryManagedBean implements Serializable {

	/**
	 * 
	 * long: serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * DirectoryManagedBean: businessDirectory
	 */
	@EJB
	private DirectoryLocal businessDirectory;

	/**
	 * 
	 * DirectoryManagedBean: contact
	 */
	private Contact contact;

	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return this.contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
