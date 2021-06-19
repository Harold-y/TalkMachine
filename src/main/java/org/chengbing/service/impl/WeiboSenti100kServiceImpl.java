package org.chengbing.service.impl;

import org.chengbing.entity.WeiboSenti100k;
import org.chengbing.dao.WeiboSenti100kMapper;
import org.chengbing.service.IWeiboSenti100kService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HaroldCI
 * @since 2021-06-19
 */
@Service
public class WeiboSenti100kServiceImpl extends ServiceImpl<WeiboSenti100kMapper, WeiboSenti100k> implements IWeiboSenti100kService {

    @Autowired
    WeiboSenti100kMapper mapper;

    @Override
    public WeiboSenti100k selectRandom() {
        return mapper.selectRandom();
    }
}
