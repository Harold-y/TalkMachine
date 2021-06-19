package org.chengbing.dao;

import org.apache.ibatis.annotations.Mapper;
import org.chengbing.entity.WeiboSenti100k;
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
public interface WeiboSenti100kMapper extends BaseMapper<WeiboSenti100k> {

    WeiboSenti100k selectRandom();
}
