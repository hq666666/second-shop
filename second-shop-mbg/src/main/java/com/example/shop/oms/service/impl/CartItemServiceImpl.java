package com.example.shop.oms.service.impl;

import com.example.shop.oms.entity.CartItem;
import com.example.shop.oms.mapper.CartItemMapper;
import com.example.shop.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-12-08
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
