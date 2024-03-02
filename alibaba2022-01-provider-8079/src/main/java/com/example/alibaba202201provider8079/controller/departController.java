package com.example.alibaba202201provider8079.controller;//package com.example.alibaba202201provider8081.controller;

import com.example.alibaba202201provider8079.pojo.Depart;
import com.example.alibaba202201provider8079.service.DepartService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/provider/depart/")
@RestController
public class departController {
    @Resource
    private DepartService departService;

    @PostMapping("/")
    public boolean saveHandle(@RequestBody Depart depart){
        return departService.saveDepart(depart);
    }

    @GetMapping("/{id}")
    public Depart getHandleById(@PathVariable("id")int id){
        return departService.getDepartById(id);
    }

    @PutMapping("/")
    public boolean modifyHandle(@RequestBody Depart depart){
        return departService.modifyDepart(depart);
    }

    @DeleteMapping("/{id}")
    public boolean deleteHandle(@PathVariable("id")int id){
        return departService.removeDepart(id);
    }

    @GetMapping("/list")
    public List<Depart> getAllDeparts(){
        return departService.getAllDeparts();
    }
}
