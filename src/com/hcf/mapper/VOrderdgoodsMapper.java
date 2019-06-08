package com.hcf.mapper;

import com.hcf.pojo.VOrderdgoods;
import com.hcf.pojo.VOrderdgoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VOrderdgoodsMapper {
    int countByExample(VOrderdgoodsExample example);

    int deleteByExample(VOrderdgoodsExample example);

    int insert(VOrderdgoods record);

    int insertSelective(VOrderdgoods record);

    List<VOrderdgoods> selectByExample(VOrderdgoodsExample example);

    int updateByExampleSelective(@Param("record") VOrderdgoods record, @Param("example") VOrderdgoodsExample example);

    int updateByExample(@Param("record") VOrderdgoods record, @Param("example") VOrderdgoodsExample example);
}