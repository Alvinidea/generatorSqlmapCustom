package com.hcf.mapper;

import com.hcf.pojo.VReview;
import com.hcf.pojo.VReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VReviewMapper {
    int countByExample(VReviewExample example);

    int deleteByExample(VReviewExample example);

    int insert(VReview record);

    int insertSelective(VReview record);

    List<VReview> selectByExample(VReviewExample example);

    int updateByExampleSelective(@Param("record") VReview record, @Param("example") VReviewExample example);

    int updateByExample(@Param("record") VReview record, @Param("example") VReviewExample example);
}