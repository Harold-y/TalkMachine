package org.chengbing.service;

import org.chengbing.entity.WeiboSenti100k;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HaroldCI
 * @since 2021-06-19
 */
public interface IWeiboSenti100kService extends IService<WeiboSenti100k> {
    WeiboSenti100k selectRandom();
}
