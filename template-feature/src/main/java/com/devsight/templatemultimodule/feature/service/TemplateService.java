package com.devsight.templatemultimodule.feature.service;

import com.devsight.templatemultimodule.feature.dao.TemplateDao;
import com.devsight.templatemultimodule.feature.model.TemplateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateService {

    private TemplateDao templateDao;

    @Autowired
    public TemplateService(TemplateDao templateDao) {
        this.templateDao = templateDao;
    }

    public TemplateEntity getData() {
        return templateDao.getData();
    }
}
