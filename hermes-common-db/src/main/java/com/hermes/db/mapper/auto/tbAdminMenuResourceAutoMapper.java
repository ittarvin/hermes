package com.hermes.db.mapper.auto;

import com.hermes.db.model.auto.tbAdminMenuResourceAuto;
import com.hermes.db.model.auto.tbAdminMenuResourceAutoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tbAdminMenuResourceAutoMapper {
    long countByExample(tbAdminMenuResourceAutoExample example);

    int deleteByExample(tbAdminMenuResourceAutoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(tbAdminMenuResourceAuto record);

    int insertSelective(tbAdminMenuResourceAuto record);

    List<tbAdminMenuResourceAuto> selectByExample(tbAdminMenuResourceAutoExample example);

    tbAdminMenuResourceAuto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") tbAdminMenuResourceAuto record, @Param("example") tbAdminMenuResourceAutoExample example);

    int updateByExample(@Param("record") tbAdminMenuResourceAuto record, @Param("example") tbAdminMenuResourceAutoExample example);

    int updateByPrimaryKeySelective(tbAdminMenuResourceAuto record);

    int updateByPrimaryKey(tbAdminMenuResourceAuto record);
}