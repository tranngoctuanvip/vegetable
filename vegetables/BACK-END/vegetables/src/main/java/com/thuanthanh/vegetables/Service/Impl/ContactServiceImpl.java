package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.Contact;
import com.thuanthanh.vegetables.Repository.ContactRepository;
import com.thuanthanh.vegetables.Repository.UserRepository;
import com.thuanthanh.vegetables.Service.ContactService;
import com.thuanthanh.vegetables.StringUtil.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("ContactService")
public class ContactServiceImpl implements ContactService {
    public static final Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);
    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private UserRepository userRepository;
    private Utils utils = new Utils();

    @Override
    public Contact add(Contact contact,Integer urid) {
        try{
            Contact con = new Contact();
            con.setContactDate(new Date());
            con.setEmailContact(utils.checkEmail(contact.getEmailContact()));
            con.setContentContact(contact.getContentContact());
            con.setUser(userRepository.findById(urid).get());
            return contactRepository.save(con);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
