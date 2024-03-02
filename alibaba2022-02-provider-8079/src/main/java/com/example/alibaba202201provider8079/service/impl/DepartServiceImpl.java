package com.example.alibaba202201provider8079.service.impl;//package com.example.alibaba202201provider8081.service.impl;

import com.example.alibaba202201provider8079.mapper.DepartMapper;
import com.example.alibaba202201provider8079.pojo.Depart;
import com.example.alibaba202201provider8079.service.DepartService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImpl implements DepartService {

    @Resource
    private DepartMapper departMapper;

    @Override
    public boolean saveDepart(Depart depart) {
        return departMapper.save(depart) != null;
    }

    @Override
    public boolean removeDepart(int id) {
        return departMapper.deleteById(id);
    }

    @Override
    public boolean modifyDepart(Depart depart) {
        return departMapper.update(depart) != null;
    }

    @Override
    public Depart getDepartById(int id) {
        return departMapper.getDepartById(id);
    }

    @Override
    public List<Depart> getAllDeparts() {
        return departMapper.findAll();
    }
}
