/**
 * DirectoryBean.java
 */
package com.directory.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.directory.data.Contact;

/**
 * @author Mohamed ABDELNABI
 *
 */
@Stateless
public class DirectoryBean implements DirectoryLocal, DirectoryRemote {
	/**
	 * 
	 * DirectoryBean: entityManager
	 */
	@PersistenceContext(unitName = "DirectoryPersistence")
	private EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.directory.business.Directory#addContact(com.directory.data.Contact)
	 */
	@Override
	public void addContact(Contact contact) {
		this.entityManager.persist(contact);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.directory.business.Directory#updateContact(com.directory.data.Contact)
	 */
	@Override
	public void updateContact(Contact contact) {
		this.entityManager.merge(contact);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.directory.business.Directory#removeContact(com.directory.data.Contact)
	 */
	@Override
	public void removeContact(Contact contact) {
		this.entityManager.remove(contact);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.directory.business.Directory#getContact(java.lang.Integer)
	 */
	@Override
	public Contact getContact(Integer id) {
		return this.entityManager.find(Contact.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.directory.business.Directory#getContacts()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Contact> getContacts() {
		Query query = this.entityManager.createQuery("SELECT c FROM Contact c");
		return query.getResultList();
	}

}
