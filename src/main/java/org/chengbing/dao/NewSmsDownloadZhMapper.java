package org.chengbing.dao;

import org.apache.ibatis.annotations.Mapper;
import org.chengbing.entity.NewSmsDownloadZh;
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
public interface NewSmsDownloadZhMapper extends BaseMapper<NewSmsDownloadZh> {

    NewSmsDownloadZh selectRandom();
}
