package com.hermes.db.mapper.auto;

import com.hermes.db.model.auto.TbAdminUserRoleAuto;
import com.hermes.db.model.auto.TbAdminUserRoleAutoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdminUserRoleAutoMapper {
    long countByExample(TbAdminUserRoleAutoExample example);

    int deleteByExample(TbAdminUserRoleAutoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAdminUserRoleAuto record);

    int insertSelective(TbAdminUserRoleAuto record);

    List<TbAdminUserRoleAuto> selectByExample(TbAdminUserRoleAutoExample example);

    TbAdminUserRoleAuto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAdminUserRoleAuto record, @Param("example") TbAdminUserRoleAutoExample example);

    int updateByExample(@Param("record") TbAdminUserRoleAuto record, @Param("example") TbAdminUserRoleAutoExample example);

    int updateByPrimaryKeySelective(TbAdminUserRoleAuto record);

    int updateByPrimaryKey(TbAdminUserRoleAuto record);
}