package com.example.alibaba202201provider8081.pojo;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@JsonIncludeProperties
public class Depart {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ID自动递增
    private Integer id;


    private String name;
}
