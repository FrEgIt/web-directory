/**
 * IDirectory.java
 */
package com.directory.business;

import java.util.List;

import com.directory.data.Contact;

/**
 * @author Mohamed ABDELNABI
 *
 */
public interface Directory {

	/**
	 * @param contact
	 */
	public void addContact(Contact contact);

	/**
	 * @param contact
	 */
	public void updateContact(Contact contact);

	/**
	 * @param contact
	 */
	public void removeContact(Contact contact);

	/**
	 * @param id
	 * @return
	 */
	public Contact getContact(Integer id);

	/**
	 * @return
	 */
	public List<Contact> getContacts();

}
