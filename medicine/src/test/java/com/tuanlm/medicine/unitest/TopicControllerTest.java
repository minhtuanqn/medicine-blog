package com.tuanlm.medicine.unitest;

import com.tuanlm.medicine.controller.TopicController;
import com.tuanlm.medicine.model.TopicModel;
import com.tuanlm.medicine.service.TopicService;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static com.tuanlm.medicine.utils.TestUtils.*;

public class TopicControllerTest {
    MockMvc mockMvc;

    TopicService topicService = Mockito.mock(TopicService.class);

    @Test
    public void when_saveTopicByPostMethod_thenSuccessfullySave() throws Exception {
        JSONObject expectModel = createTopicObject();
        when(topicService.createTopic(any())).thenReturn(createTopicModel());
        this.mockMvc = MockMvcBuilders.standaloneSetup(new TopicController(topicService)).build();
        JSONObject paramJson = createTopicObject();
        mockMvc.perform(post("/topics")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(paramJson.toString()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("test"));
                //.andExpect(jsonPath("$.description").value("test"));
    }
}
