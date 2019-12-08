package com.example.shop.pms.service.impl;

import com.example.shop.pms.entity.Comment;
import com.example.shop.pms.mapper.CommentMapper;
import com.example.shop.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
