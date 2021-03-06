package com.simple.consumer.movie.controller;

import com.simple.consumer.movie.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author haoj
 * @date 2018/12/11
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://127.0.0.1:8000/" + id, User.class);
    }
}
