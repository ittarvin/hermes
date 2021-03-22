package com.hermes.db.mapper.auto;

import com.hermes.db.model.auto.TbPlatformClientChannelAuto;
import com.hermes.db.model.auto.TbPlatformClientChannelAutoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPlatformClientChannelAutoMapper {
    long countByExample(TbPlatformClientChannelAutoExample example);

    int deleteByExample(TbPlatformClientChannelAutoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPlatformClientChannelAuto record);

    int insertSelective(TbPlatformClientChannelAuto record);

    List<TbPlatformClientChannelAuto> selectByExample(TbPlatformClientChannelAutoExample example);

    TbPlatformClientChannelAuto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPlatformClientChannelAuto record, @Param("example") TbPlatformClientChannelAutoExample example);

    int updateByExample(@Param("record") TbPlatformClientChannelAuto record, @Param("example") TbPlatformClientChannelAutoExample example);

    int updateByPrimaryKeySelective(TbPlatformClientChannelAuto record);

    int updateByPrimaryKey(TbPlatformClientChannelAuto record);
}