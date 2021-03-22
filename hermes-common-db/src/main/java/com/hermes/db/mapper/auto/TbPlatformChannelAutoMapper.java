package com.hermes.db.mapper.auto;

import com.hermes.db.model.auto.TbPlatformChannelAuto;
import com.hermes.db.model.auto.TbPlatformChannelAutoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPlatformChannelAutoMapper {
    long countByExample(TbPlatformChannelAutoExample example);

    int deleteByExample(TbPlatformChannelAutoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPlatformChannelAuto record);

    int insertSelective(TbPlatformChannelAuto record);

    List<TbPlatformChannelAuto> selectByExample(TbPlatformChannelAutoExample example);

    TbPlatformChannelAuto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPlatformChannelAuto record, @Param("example") TbPlatformChannelAutoExample example);

    int updateByExample(@Param("record") TbPlatformChannelAuto record, @Param("example") TbPlatformChannelAutoExample example);

    int updateByPrimaryKeySelective(TbPlatformChannelAuto record);

    int updateByPrimaryKey(TbPlatformChannelAuto record);
}