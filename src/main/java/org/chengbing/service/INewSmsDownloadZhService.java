package org.chengbing.service;

import org.chengbing.entity.NewSmsDownloadZh;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HaroldCI
 * @since 2021-06-19
 */
public interface INewSmsDownloadZhService extends IService<NewSmsDownloadZh> {
    NewSmsDownloadZh selectRandom();
}
