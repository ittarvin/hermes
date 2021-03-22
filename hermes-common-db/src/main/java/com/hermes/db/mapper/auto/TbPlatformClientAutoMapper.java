package com.hermes.db.mapper.auto;

import com.hermes.db.model.auto.TbPlatformClientAuto;
import com.hermes.db.model.auto.TbPlatformClientAutoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPlatformClientAutoMapper {
    long countByExample(TbPlatformClientAutoExample example);

    int deleteByExample(TbPlatformClientAutoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPlatformClientAuto record);

    int insertSelective(TbPlatformClientAuto record);

    List<TbPlatformClientAuto> selectByExample(TbPlatformClientAutoExample example);

    TbPlatformClientAuto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPlatformClientAuto record, @Param("example") TbPlatformClientAutoExample example);

    int updateByExample(@Param("record") TbPlatformClientAuto record, @Param("example") TbPlatformClientAutoExample example);

    int updateByPrimaryKeySelective(TbPlatformClientAuto record);

    int updateByPrimaryKey(TbPlatformClientAuto record);
}