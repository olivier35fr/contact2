package com.olivier.contact.front.controllers.tckits;

import com.olivier.contact.back.services.tckits.Emat8Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Emat8Controller {

    @Autowired
    private Emat8Service emat8Service;

    @GetMapping("/emat8")
    public String showEmat8List(Model model) {
        model.addAttribute("emat8", emat8Service.getAllEmat8());
        return "emat8-list";
    }
}
