package com.example.alibaba202201provider8079.mapper;

import com.example.alibaba202201provider8079.pojo.Depart;
import org.apache.ibatis.annotations.*;

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

    @Update("update depart set name = #{name} where id = #{id}")
    Boolean update(Depart depart);
}
