package com.devsight.templatemultimodule.feature.controller;

import com.devsight.templatemultimodule.feature.model.TemplateEntity;
import com.devsight.templatemultimodule.feature.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feature")
public class TemplateController {

    @Autowired
    private TemplateService templateService;

    @GetMapping("/data")
    public TemplateEntity getData() {
        return templateService.getData();
    }
}
