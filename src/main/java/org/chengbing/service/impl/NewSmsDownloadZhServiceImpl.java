package org.chengbing.service.impl;

import org.chengbing.entity.NewSmsDownloadZh;
import org.chengbing.dao.NewSmsDownloadZhMapper;
import org.chengbing.service.INewSmsDownloadZhService;
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
public class NewSmsDownloadZhServiceImpl extends ServiceImpl<NewSmsDownloadZhMapper, NewSmsDownloadZh> implements INewSmsDownloadZhService {

    @Autowired
    NewSmsDownloadZhMapper mapper;

    @Override
    public NewSmsDownloadZh selectRandom() {
        return mapper.selectRandom();
    }
}
