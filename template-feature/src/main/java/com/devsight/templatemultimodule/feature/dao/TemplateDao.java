package com.devsight.templatemultimodule.feature.dao;

import com.devsight.templatemultimodule.feature.model.TemplateEntity;
import org.springframework.stereotype.Repository;

@Repository
public class TemplateDao {

    public TemplateEntity getData() {
        TemplateEntity entity = new TemplateEntity();
        entity.setId(1);
        entity.setName("Greetings, from TemplateMultiModuleProject");
        return entity;
    }
}
