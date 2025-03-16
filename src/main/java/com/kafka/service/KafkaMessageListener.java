package com.kafka.service;

import com.kafka.dto.Customer;
import com.kafka.repo.OrderRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    @Autowired
    private OrderRepo orderRepo;

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "javatechie-demo",groupId = "jt-group")
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events from consumer1 {} ", customer.toString());
        orderRepo.save(customer);
    }
    @KafkaListener(topics = "javatechie-demo",groupId = "jt-group")
    public void consumeEvents1(Customer customer) {
        log.info("consumer consume the events from consumer2 {} ", customer.toString());
        orderRepo.save(customer);
    }
    @KafkaListener(topics = "javatechie-demo",groupId = "jt-group")
    public void consumeEvents2(Customer customer) {
        log.info("consumer consume the events from consumer3 {} ", customer.toString());
        orderRepo.save(customer);
    }
}
