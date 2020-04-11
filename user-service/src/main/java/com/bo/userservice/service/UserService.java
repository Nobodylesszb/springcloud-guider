package com.bo.userservice.service;

import com.bo.userservice.domain.User;

import java.util.List;

/**
 * @Auther: bo
 * @Date: 2020/4/11 21:22
 * @Version:
 * @Description:
 */
public interface UserService {

    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
