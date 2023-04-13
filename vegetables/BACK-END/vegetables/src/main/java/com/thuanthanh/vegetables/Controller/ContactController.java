package com.thuanthanh.vegetables.Controller;

import com.thuanthanh.vegetables.Entity.Contact;
import com.thuanthanh.vegetables.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contact")
public class ContactController {
    @Autowired
    private ContactService contactService;
    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody Contact contact, @Param("urid") Integer urid){
        try {
            return new ResponseEntity<>(contactService.add(contact,urid),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
