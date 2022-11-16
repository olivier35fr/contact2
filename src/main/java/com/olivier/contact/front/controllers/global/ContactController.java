package com.olivier.contact.front.controllers.global;

import com.olivier.contact.back.dal.global.Contact;
import com.olivier.contact.back.services.global.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/")
    public String showContactList(Model model) {
        model.addAttribute("contactList", contactService.getAllContacts());
        return "contact-list-view";
    }

    @GetMapping("/contact/{contactId}")
    public String showContactById(@PathVariable int contactId, Model model) {
        if(contactService.existContactById(contactId)) {
            model.addAttribute("contact", contactService.getContact(contactId));
            return "contact-view";
        }
        return showErrorPage();
    }

    @GetMapping("/contact/create")
    public String showCreateContactPage( Model model ) {
        model.addAttribute("contact", new Contact());
        return "create-contact-view";
    }

    @PostMapping("/contact/save")
    public String createContact(Contact contact, Model model) {
        if(!contactService.existContactByEmail(contact.getEmail())) {
            contactService.createContact(contact);
            return "redirect:/";
        }
        model.addAttribute("contact", new Contact());
        model.addAttribute("error", "This contact already exist");
        return "create-contact-view";
    }

    @GetMapping("contact/delete/{contactId}")
    public String deleteContact(@PathVariable int contactId) {
        if(contactService.existContactById(contactId)) {
            contactService.deleteContact(contactId);
        }
        return "redirect:/";
    }

    @PostMapping("contact/update")
    public String editContact(@ModelAttribute Contact contact) {
        contactService.updateContact(contact);
        return "redirect:/";
    }

    @GetMapping("/error")
    public String showErrorPage() {
        return "error-view";
    }

}
