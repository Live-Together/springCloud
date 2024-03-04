package com.example.alibaba202202consumer8080.controller;

import com.example.alibaba202202consumer8080.pojo.Depart;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer/depart")
public class DepartController {
    @Resource
    private RestTemplate template;

    // 直连方式
    // private static final String url = "http://localhost:8079/provider/depart/";

    //微服务方式
    private static final String url = "http://depart-provider/provider/depart/";

    @PostMapping("/")
    public boolean saveHandle(@RequestBody Depart depart){
        return template.postForObject(url, depart, Boolean.class);
    }

    @DeleteMapping("/{id}")
    public void deleteHandle(@PathVariable String id){
        template.delete(url + id);
    }

    @PutMapping("/")
    public void modifyHandle(@RequestBody Depart depart){
        template.put(url, depart);
    }

    @GetMapping("/{id}")
    public Depart getHandleById(@PathVariable String id){
        return template.getForObject(url + id, Depart.class);
    }

    @GetMapping("/list")
    public List<Depart> getAll(){
        return template.getForObject(url + "list", List.class);
    }
}
