package com.kafka.controller;

import com.kafka.dto.Order;
import com.kafka.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaMessagePublisher publisher;

    @PostMapping("/publish")
    public void sendEvents(@RequestBody Order order) {
        publisher.sendEventsToTopic(order);
    }

}
