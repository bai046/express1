package com.yy.FB.mapper;

import com.yy.FB.entity.TradeRecording;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author abc
 * @since 2021-05-20
 */
@Repository
@Mapper
public interface TradeRecordingMapper extends BaseMapper<TradeRecording> {

}
