package com.mapper;

import com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public List<User> getUserList();
    public List<User> getUserByLimit(Map map);
    List<User> getUserByRowBounds();
}
