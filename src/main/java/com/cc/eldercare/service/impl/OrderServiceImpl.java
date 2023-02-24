package com.cc.eldercare.service.impl;

import com.cc.eldercare.entity.Order;
import com.cc.eldercare.mapper.OrderMapper;
import com.cc.eldercare.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author resetchen
 * @since 2023-02-24
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
