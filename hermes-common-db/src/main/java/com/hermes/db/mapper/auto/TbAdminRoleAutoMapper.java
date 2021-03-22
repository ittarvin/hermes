package com.hermes.db.mapper.auto;

import com.hermes.db.model.auto.TbAdminRoleAuto;
import com.hermes.db.model.auto.TbAdminRoleAutoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdminRoleAutoMapper {
    long countByExample(TbAdminRoleAutoExample example);

    int deleteByExample(TbAdminRoleAutoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAdminRoleAuto record);

    int insertSelective(TbAdminRoleAuto record);

    List<TbAdminRoleAuto> selectByExample(TbAdminRoleAutoExample example);

    TbAdminRoleAuto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAdminRoleAuto record, @Param("example") TbAdminRoleAutoExample example);

    int updateByExample(@Param("record") TbAdminRoleAuto record, @Param("example") TbAdminRoleAutoExample example);

    int updateByPrimaryKeySelective(TbAdminRoleAuto record);

    int updateByPrimaryKey(TbAdminRoleAuto record);
}