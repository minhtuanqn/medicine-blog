package com.tuanlm.medicine.controller;

import com.tuanlm.medicine.service.TopicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/topics")
public class TopicController {
    private TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }
}
