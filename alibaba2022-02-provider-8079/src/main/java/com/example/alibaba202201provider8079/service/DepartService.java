package com.example.alibaba202201provider8079.service;

import com.example.alibaba202201provider8079.pojo.Depart;

import java.util.List;

public interface DepartService {
    boolean saveDepart(Depart depart);
    boolean removeDepart(int id);
    boolean modifyDepart(Depart depart);
    Depart getDepartById(int id);
    List<Depart> getAllDeparts();

}
