package com.example.alibaba202201provider8081.mapper;

import com.example.alibaba202201provider8081.pojo.Depart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartMapper {

    @Insert("insert into depart(name) values (#{name})")
    Boolean save(Depart depart);

    @Delete("delete from depart where id = #{id}")
    Boolean deleteById(int id);

    @Select("select * from depart where id = #{id}")
    Depart getDepartById(int id);

    @Select("select * from depart")
    List<Depart> findAll();
}
