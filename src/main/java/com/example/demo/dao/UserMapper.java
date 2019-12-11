package com.example.demo.dao;

import com.example.demo.domain.UserDemo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @version 1.0  on 2019/12/11 16:03
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    UserDemo selectUser(Integer id);

    void insertUser(@Param("user") UserDemo user);
}
