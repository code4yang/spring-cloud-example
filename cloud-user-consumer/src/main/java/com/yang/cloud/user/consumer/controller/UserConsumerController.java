package com.yang.cloud.user.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getAll")
    public ResponseEntity<?> selectAll(){
        return restTemplate.getForEntity("http://cloud-user-service/sys/user/selectAll", Object.class);
    }

}
