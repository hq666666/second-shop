package com.person.shop.pms.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.person.shop.api.pms.entity.Album;
import com.person.shop.api.pms.service.AlbumService;
import com.person.shop.pms.mapper.AlbumMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author hq
 * @since 2019-12-08
 */
@Service
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}
