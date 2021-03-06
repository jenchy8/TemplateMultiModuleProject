package com.devsight.templatemultimodule.feature.service;

import com.devsight.templatemultimodule.feature.dao.TemplateDao;
import com.devsight.templatemultimodule.feature.model.TemplateEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TemplateServiceTests {
    private static final int SOME_ID = 1;
    private static final String SOME_NAME = "Test name";

    private TemplateService templateService;

    @Mock
    private TemplateDao mockTemplateDao;

    @Before
    public void setup() {
        templateService = new TemplateService(mockTemplateDao);
    }

    @Test
    public void testGetData() {
        // Mock data
        TemplateEntity mockData = new TemplateEntity();
        mockData.setId(SOME_ID);
        mockData.setName(SOME_NAME);

        when(mockTemplateDao.getData()).thenReturn(mockData);

        // Actual
        TemplateEntity actual = templateService.getData();

        // Test actual vs expected
        assertThat(actual.getId()).isEqualTo(1);
        assertThat(actual.getName()).isEqualTo("Test name");
    }
}
