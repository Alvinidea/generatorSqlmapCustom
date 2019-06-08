package com.hcf.mapper;

import com.hcf.pojo.TbSuper;
import com.hcf.pojo.TbSuperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSuperMapper {
    int countByExample(TbSuperExample example);

    int deleteByExample(TbSuperExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbSuper record);

    int insertSelective(TbSuper record);

    List<TbSuper> selectByExample(TbSuperExample example);

    TbSuper selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbSuper record, @Param("example") TbSuperExample example);

    int updateByExample(@Param("record") TbSuper record, @Param("example") TbSuperExample example);

    int updateByPrimaryKeySelective(TbSuper record);

    int updateByPrimaryKey(TbSuper record);
}