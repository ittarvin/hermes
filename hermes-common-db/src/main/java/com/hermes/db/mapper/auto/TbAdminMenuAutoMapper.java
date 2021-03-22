package com.hermes.db.mapper.auto;

import com.hermes.db.model.auto.TbAdminMenuAuto;
import com.hermes.db.model.auto.TbAdminMenuAutoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdminMenuAutoMapper {
    long countByExample(TbAdminMenuAutoExample example);

    int deleteByExample(TbAdminMenuAutoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAdminMenuAuto record);

    int insertSelective(TbAdminMenuAuto record);

    List<TbAdminMenuAuto> selectByExample(TbAdminMenuAutoExample example);

    TbAdminMenuAuto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAdminMenuAuto record, @Param("example") TbAdminMenuAutoExample example);

    int updateByExample(@Param("record") TbAdminMenuAuto record, @Param("example") TbAdminMenuAutoExample example);

    int updateByPrimaryKeySelective(TbAdminMenuAuto record);

    int updateByPrimaryKey(TbAdminMenuAuto record);
}