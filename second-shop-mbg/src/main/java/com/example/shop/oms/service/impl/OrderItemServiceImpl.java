package com.example.shop.oms.service.impl;

import com.example.shop.oms.entity.OrderItem;
import com.example.shop.oms.mapper.OrderItemMapper;
import com.example.shop.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-12-08
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
