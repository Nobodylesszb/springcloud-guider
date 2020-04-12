package com.bo.feighservice.service;

import com.bo.feighservice.domain.CommonResult;
import com.bo.feighservice.domain.User;
import com.bo.feighservice.service.impl.UserFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: bo
 * @Date: 2020/4/12 16:15
 * @Version:
 * @Description:
 */

@FeignClient(value = "user-service",fallback = UserFallbackService.class )
public interface UserService {

    @PostMapping("/user/create")
    CommonResult create(@RequestBody User user);

    @GetMapping("/user/{id}")
    CommonResult<User> getUser(@PathVariable Long id);

    @GetMapping("/user/getByUsername")
    CommonResult<User> getByUsername(@RequestParam String username);

    @PostMapping("/user/update")
    CommonResult update(@RequestBody User user);

    @PostMapping("/user/delete/{id}")
    CommonResult delete(@PathVariable Long id);
}
