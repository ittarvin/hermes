package com.hermes.db.mapper.auto;

import com.hermes.db.model.auto.TbPlatformUserAuto;
import com.hermes.db.model.auto.TbPlatformUserAutoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPlatformUserAutoMapper {
    long countByExample(TbPlatformUserAutoExample example);

    int deleteByExample(TbPlatformUserAutoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPlatformUserAuto record);

    int insertSelective(TbPlatformUserAuto record);

    List<TbPlatformUserAuto> selectByExample(TbPlatformUserAutoExample example);

    TbPlatformUserAuto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPlatformUserAuto record, @Param("example") TbPlatformUserAutoExample example);

    int updateByExample(@Param("record") TbPlatformUserAuto record, @Param("example") TbPlatformUserAutoExample example);

    int updateByPrimaryKeySelective(TbPlatformUserAuto record);

    int updateByPrimaryKey(TbPlatformUserAuto record);
}