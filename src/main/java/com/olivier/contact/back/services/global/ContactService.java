package com.olivier.contact.back.services.global;

import com.olivier.contact.back.dal.global.ContactDao;
import com.olivier.contact.back.dal.global.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactDao contactDao;

    public List<Contact> getAllContacts() {
        return contactDao.findAll();
    }

    public Contact getContact(int contactId) {
        return contactDao.findById(contactId);
    }

    public void createContact(Contact contact) {
        contactDao.insert(contact.getFirstname(), contact.getLastname(), contact.getEmail());
    }

    public void updateContact(Contact contact) {
        contactDao.update(contact.getContactId(), contact.getFirstname(), contact.getLastname(), contact.getEmail());
    }

    public void deleteContact(int contactId) {
        contactDao.delete(contactId);
    }

    public boolean existContactById(int contactId) {
        return contactDao.existById(contactId);
    }

    public boolean existContactByEmail(String email) {
        return contactDao.existByEmail(email);
    }

}
