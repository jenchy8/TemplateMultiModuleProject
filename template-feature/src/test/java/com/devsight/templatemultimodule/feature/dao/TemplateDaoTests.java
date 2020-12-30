package com.devsight.templatemultimodule.feature.dao;

import com.devsight.templatemultimodule.feature.model.TemplateEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class TemplateDaoTests {

    private TemplateDao templateDao;

    @Before
    public void setup() {
        templateDao = new TemplateDao();
    }

    @Test
    public void testGetData() {
        // actual
        TemplateEntity actual = templateDao.getData();

        // Test actual vs expected
        assertThat(actual).isNotNull();
    }
}
