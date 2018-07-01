/**
 * DirectoryManagedBean.java
 */
package com.directory.view;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.directory.business.DirectoryLocal;
import com.directory.data.Contact;

/**
 * @author Mohamed ABDELNABI
 *
 */
@ManagedBean(name = "directory")
@RequestScoped
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

	public DirectoryManagedBean() {
		this.contact = new Contact();
	}

	/**
	 * 
	 */
	public void save() {
		this.businessDirectory.addContact(this.contact);
	}

	/**
	 * @return the businessDirectory
	 */
	public DirectoryLocal getBusinessDirectory() {
		return this.businessDirectory;
	}

	/**
	 * @param businessDirectory
	 *            the businessDirectory to set
	 */
	public void setBusinessDirectory(DirectoryLocal businessDirectory) {
		this.businessDirectory = businessDirectory;
	}

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

	/**
	 * @return
	 */
	public List<Contact> getContacts() {
		return this.businessDirectory.getContacts();
	}
}
