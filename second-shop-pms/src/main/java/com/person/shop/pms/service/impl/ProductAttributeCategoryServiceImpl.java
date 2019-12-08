package com.person.shop.pms.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.person.shop.api.pms.entity.ProductAttributeCategory;
import com.person.shop.api.pms.service.ProductAttributeCategoryService;
import com.person.shop.pms.mapper.ProductAttributeCategoryMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品属性分类表 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-12-08
 */
@Service
public class ProductAttributeCategoryServiceImpl extends ServiceImpl<ProductAttributeCategoryMapper, ProductAttributeCategory> implements ProductAttributeCategoryService {

}
