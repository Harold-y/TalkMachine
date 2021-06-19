package org.chengbing.service;

import org.chengbing.entity.OnlineShopping10Cats;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HaroldCI
 * @since 2021-06-19
 */
public interface IOnlineShopping10CatsService extends IService<OnlineShopping10Cats> {
    OnlineShopping10Cats selectRandom();
}
