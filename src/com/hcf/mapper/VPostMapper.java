package com.hcf.mapper;

import com.hcf.pojo.VPost;
import com.hcf.pojo.VPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VPostMapper {
    int countByExample(VPostExample example);

    int deleteByExample(VPostExample example);

    int insert(VPost record);

    int insertSelective(VPost record);

    List<VPost> selectByExample(VPostExample example);

    int updateByExampleSelective(@Param("record") VPost record, @Param("example") VPostExample example);

    int updateByExample(@Param("record") VPost record, @Param("example") VPostExample example);
}