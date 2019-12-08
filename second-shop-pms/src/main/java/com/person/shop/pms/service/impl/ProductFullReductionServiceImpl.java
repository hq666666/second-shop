package com.person.shop.pms.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.person.shop.api.pms.entity.ProductFullReduction;
import com.person.shop.api.pms.service.ProductFullReductionService;
import com.person.shop.pms.mapper.ProductFullReductionMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-12-08
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
