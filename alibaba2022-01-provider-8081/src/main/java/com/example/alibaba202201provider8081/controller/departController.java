//package com.example.alibaba202201provider8081.controller;
//
//import com.example.alibaba202201provider8081.pojo.Depart;
//import com.example.alibaba202201provider8081.service.DepartService;
//import jakarta.annotation.Resource;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RequestMapping("/provider/depart/")
//@RestController
//public class departController {
//    @Resource
//    private DepartService departService;
//
//    @PostMapping("/")
//    public boolean saveHandle(@RequestBody Depart depart){
//        System.out.println(depart);
//        return departService.saveDepart(depart);
//    }
//
//    @GetMapping("/{id}")
//    public Depart getHandleById(@PathVariable("id")int id){
//        System.out.println(id);
//        return departService.getDepartById(id);
//    }
//
//    @PutMapping("/")
//    public boolean modifyHandle(@RequestBody Depart depart){
//        return departService.modifyDepart(depart);
//    }
//
//    @DeleteMapping("/{id}")
//    public boolean deleteHandle(@PathVariable("id")int id){
//        System.out.println(id);
//        return departService.removeDepart(id);
//    }
//
//    @GetMapping("/list")
//    public List<Depart> getAllDeparts(){
//        return departService.getAllDeparts();
//    }
//}
