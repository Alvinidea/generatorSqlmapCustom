package com.hcf.mapper;

import com.hcf.pojo.TbStore;
import com.hcf.pojo.TbStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStoreMapper {
    int countByExample(TbStoreExample example);

    int deleteByExample(TbStoreExample example);

    int deleteByPrimaryKey(String storeid);

    int insert(TbStore record);

    int insertSelective(TbStore record);

    List<TbStore> selectByExample(TbStoreExample example);

    TbStore selectByPrimaryKey(String storeid);

    int updateByExampleSelective(@Param("record") TbStore record, @Param("example") TbStoreExample example);

    int updateByExample(@Param("record") TbStore record, @Param("example") TbStoreExample example);

    int updateByPrimaryKeySelective(TbStore record);

    int updateByPrimaryKey(TbStore record);
}