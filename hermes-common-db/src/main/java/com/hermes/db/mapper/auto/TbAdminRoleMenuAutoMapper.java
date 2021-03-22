package com.hermes.db.mapper.auto;

import com.hermes.db.model.auto.TbAdminRoleMenuAuto;
import com.hermes.db.model.auto.TbAdminRoleMenuAutoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdminRoleMenuAutoMapper {
    long countByExample(TbAdminRoleMenuAutoExample example);

    int deleteByExample(TbAdminRoleMenuAutoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAdminRoleMenuAuto record);

    int insertSelective(TbAdminRoleMenuAuto record);

    List<TbAdminRoleMenuAuto> selectByExample(TbAdminRoleMenuAutoExample example);

    TbAdminRoleMenuAuto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAdminRoleMenuAuto record, @Param("example") TbAdminRoleMenuAutoExample example);

    int updateByExample(@Param("record") TbAdminRoleMenuAuto record, @Param("example") TbAdminRoleMenuAutoExample example);

    int updateByPrimaryKeySelective(TbAdminRoleMenuAuto record);

    int updateByPrimaryKey(TbAdminRoleMenuAuto record);
}