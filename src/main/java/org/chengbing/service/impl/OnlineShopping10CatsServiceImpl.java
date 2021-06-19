package org.chengbing.service.impl;

import org.chengbing.entity.OnlineShopping10Cats;
import org.chengbing.dao.OnlineShopping10CatsMapper;
import org.chengbing.service.IOnlineShopping10CatsService;
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
public class OnlineShopping10CatsServiceImpl extends ServiceImpl<OnlineShopping10CatsMapper, OnlineShopping10Cats> implements IOnlineShopping10CatsService {

    @Autowired
    OnlineShopping10CatsMapper mapper;

    @Override
    public OnlineShopping10Cats selectRandom() {
        return mapper.selectRandom();
    }
}
