package com.example.shop.pms.service.impl;

import com.example.shop.pms.entity.ProductLadder;
import com.example.shop.pms.mapper.ProductLadderMapper;
import com.example.shop.pms.service.ProductLadderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-12-08
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderService {

}
