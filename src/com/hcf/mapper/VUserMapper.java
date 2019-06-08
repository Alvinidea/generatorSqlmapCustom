package com.hcf.mapper;

import com.hcf.pojo.VUser;
import com.hcf.pojo.VUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VUserMapper {
    int countByExample(VUserExample example);

    int deleteByExample(VUserExample example);

    int insert(VUser record);

    int insertSelective(VUser record);

    List<VUser> selectByExample(VUserExample example);

    int updateByExampleSelective(@Param("record") VUser record, @Param("example") VUserExample example);

    int updateByExample(@Param("record") VUser record, @Param("example") VUserExample example);
}