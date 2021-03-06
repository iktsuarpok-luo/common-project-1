package com.cskaoyan.mapper;

import com.cskaoyan.bean.FinalMeasuretCheck;
import com.cskaoyan.bean.FinalMeasuretCheckExample;
import java.util.List;

import com.cskaoyan.bean.UnqualifyApply;
import org.apache.ibatis.annotations.Param;

public interface FinalMeasuretCheckMapper {
    long countByExample(FinalMeasuretCheckExample example);

    int deleteByExample(FinalMeasuretCheckExample example);

    int deleteByPrimaryKey(String fMeasureCheckId);

    int insert(FinalMeasuretCheck record);

    int insertSelective(FinalMeasuretCheck record);

    List<FinalMeasuretCheck> selectByExample(FinalMeasuretCheckExample example);

    FinalMeasuretCheck selectByPrimaryKey(String fMeasureCheckId);

    int updateByExampleSelective(@Param("record") FinalMeasuretCheck record, @Param("example") FinalMeasuretCheckExample example);

    int updateByExample(@Param("record") FinalMeasuretCheck record, @Param("example") FinalMeasuretCheckExample example);

    int updateByPrimaryKeySelective(FinalMeasuretCheck record);

    int updateByPrimaryKey(FinalMeasuretCheck record);
    List<FinalMeasuretCheck> queryAllFinalMeasureCheck();


    List<FinalMeasuretCheck> finalMeasureCheckIdSearch(String searchValue);

    List<FinalMeasuretCheck> finalMeasureOrderIdSearch(String searchValue);
}