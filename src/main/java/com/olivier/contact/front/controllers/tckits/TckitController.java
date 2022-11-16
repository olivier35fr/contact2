package com.olivier.contact.front.controllers.tckits;

import com.olivier.contact.back.services.tckits.TckitDetailService;
import com.olivier.contact.back.services.tckits.TckitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TckitController {

    @Autowired
    private TckitService tckitService;

    @Autowired
    private TckitDetailService tckitDetailService;

    @GetMapping("/tckit")
    public String showTckitList(Model model) {
        model.addAttribute("tckitList", tckitService.getAllTckit());
        return "tckit-list-view";
    }

    @GetMapping("/tckit/{tckitId}")
    public String showTckitDetail(@PathVariable int tckitId, Model model) {
        model.addAttribute("tckit", tckitDetailService.getTckitDetail(tckitId));
        return "tckit-detail-view";
    }

}
