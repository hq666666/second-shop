package com.person.shop.pms.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.person.shop.api.pms.entity.Product;
import com.person.shop.api.pms.service.ProductService;
import com.person.shop.pms.mapper.ProductMapper;
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
