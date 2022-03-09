package com.tuanlm.medicine.utils;

import com.tuanlm.medicine.model.TopicModel;
import org.json.JSONException;
import org.json.JSONObject;

public class TestUtils {
    public static JSONObject createTopicObject() throws JSONException {
        JSONObject topic = new JSONObject();
        topic.put("name", "test");
        topic.put("description", "test");
        return topic;
    }

    public static TopicModel createTopicModel() throws JSONException {
        TopicModel topic = new TopicModel();
        topic.setName("test");
        topic.setName("test");
        return topic;
    }
}
