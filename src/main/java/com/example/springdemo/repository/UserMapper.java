package com.example.springdemo.repository;

import com.example.springdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
@Mapper
public interface UserMapper {
    public List<User> userList();
}
