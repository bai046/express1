package com.yy.FB.service.impl;

import com.yy.FB.entity.User;
import com.yy.FB.mapper.UserMapper;
import com.yy.FB.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author abc
 * @since 2021-05-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{


}
