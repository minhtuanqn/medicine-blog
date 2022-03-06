package com.tuanlm.medicine.controller;

import com.tuanlm.medicine.model.TopicModel;
import com.tuanlm.medicine.service.TopicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping(path = "/topics")
public class TopicController {
    private TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @PostMapping(path = "", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Object> createDepartment(@Valid @RequestBody TopicModel requestModel) {
        TopicModel savedModel = topicService.createTopic(requestModel);
        return new ResponseEntity<>(savedModel, HttpStatus.OK);
    }
}
