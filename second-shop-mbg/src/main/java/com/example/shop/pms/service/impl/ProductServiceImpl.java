package com.example.shop.pms.service.impl;

import com.example.shop.pms.entity.Product;
import com.example.shop.pms.mapper.ProductMapper;
import com.example.shop.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-12-08
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
