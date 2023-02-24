package com.cc.eldercare.service.impl;

import com.cc.eldercare.entity.UserInfo;
import com.cc.eldercare.mapper.UserInfoMapper;
import com.cc.eldercare.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author resetchen
 * @since 2023-02-24
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
