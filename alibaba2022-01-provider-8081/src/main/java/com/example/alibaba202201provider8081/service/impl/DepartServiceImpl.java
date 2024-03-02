//package com.example.alibaba202201provider8081.service.impl;
//
//import com.example.alibaba202201provider8081.mapper.DepartMapper;
//import com.example.alibaba202201provider8081.pojo.Depart;
//import com.example.alibaba202201provider8081.repository.DepartRepository;
//import com.example.alibaba202201provider8081.service.DepartService;
//import jakarta.annotation.Resource;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class DepartServiceImpl implements DepartService {
//
//    @Resource
//    private DepartMapper departMapper;
//
//    @Override
//    public boolean saveDepart(Depart depart) {
//        return departMapper.save(depart) != null;
//    }
//
//    @Override
//    public boolean removeDepart(int id) {
//        if(departRepository.existsById(id)){
//            departRepository.deleteById(id);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean modifyDepart(Depart depart) {
//        return departRepository.save(depart) != null;
//    }
//
//    @Override
//    public Depart getDepartById(int id) {
//        if(departRepository.existsById(id)){
//            return departRepository.getReferenceById(id);
//        }
//        Depart depart = new Depart();
//        depart.setName("no this depart");
//        return depart;
//    }
//
//    @Override
//    public List<Depart> getAllDeparts() {
//        return departRepository.findAll();
//    }
//}
