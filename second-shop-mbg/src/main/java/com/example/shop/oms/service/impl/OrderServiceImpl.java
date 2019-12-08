package com.example.shop.oms.service.impl;

import com.example.shop.oms.entity.Order;
import com.example.shop.oms.mapper.OrderMapper;
import com.example.shop.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-12-08
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
