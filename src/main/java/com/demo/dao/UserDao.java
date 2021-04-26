package com.demo.dao;

import com.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    List<User> findAll();

    @Select("select * from user where username = #{username} and password = #{password}")
    User findUser(User user);

    @Select("select * from user where username = #{username}")
    User findUserByname(String username);
}
