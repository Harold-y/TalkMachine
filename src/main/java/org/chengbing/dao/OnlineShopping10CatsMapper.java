package org.chengbing.dao;

import org.apache.ibatis.annotations.Mapper;
import org.chengbing.entity.OnlineShopping10Cats;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author HaroldCI
 * @since 2021-06-19
 */
@Mapper
public interface OnlineShopping10CatsMapper extends BaseMapper<OnlineShopping10Cats> {

    OnlineShopping10Cats selectRandom();
}
