package com.person.shop.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.person.shop.api.pms.entity.Comment;
import com.person.shop.api.pms.service.CommentService;
import com.person.shop.pms.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-12-08
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
