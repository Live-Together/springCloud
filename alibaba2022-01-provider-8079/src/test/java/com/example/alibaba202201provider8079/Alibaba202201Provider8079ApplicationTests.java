package com.example.alibaba202201provider8079;

import com.example.alibaba202201provider8079.mapper.DepartMapper;
import com.example.alibaba202201provider8079.pojo.Depart;
import com.example.alibaba202201provider8079.service.DepartService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Alibaba202201Provider8079ApplicationTests {
    @Resource
    private DepartService departService;

    @Resource
    private DepartMapper departMapper;

    void addDepart(){
        Depart depart = new Depart(6, "市场部");
        departService.saveDepart(depart);
    }

    @Test
    void testGetById(){
        System.out.println(departMapper.getDepartById(12));
    }

    @Test
    void testFindAll(){
        System.out.println(departMapper.findAll());
    }

    @Test
    void contextLoads() {
    }

}
