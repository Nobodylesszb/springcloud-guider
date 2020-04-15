package com.bo.feighservice.service.impl;

import com.bo.feighservice.domain.CommonResult;
import com.bo.feighservice.domain.User;
import com.bo.feighservice.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @Auther: bo
 * @Date: 2020/4/12 16:16
 * @Version:
 * @Description:
 */
@Component
public class UserFallbackService implements UserService {

    @Override
    public CommonResult create(User user) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getUser(Long id) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getByUsername(String username) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult update(User user) {
        return new CommonResult("调用失败，服务被降级", 500);
    }

    @Override
    public CommonResult delete(Long id) {
        return new CommonResult("调用失败，服务被降级", 500);
    }
}
