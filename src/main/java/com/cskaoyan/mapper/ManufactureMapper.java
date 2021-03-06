package com.cskaoyan.mapper;

import com.cskaoyan.bean.Manufacture;
import com.cskaoyan.bean.ManufactureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManufactureMapper {
    long countByExample(ManufactureExample example);

    int deleteByExample(ManufactureExample example);

    int deleteByPrimaryKey(String manufactureSn);

    int insert(Manufacture record);

    int insertSelective(Manufacture record);

    List<Manufacture> selectByExample(ManufactureExample example);

    Manufacture selectByPrimaryKey(String manufactureSn);

    int updateByExampleSelective(@Param("record") Manufacture record, @Param("example") ManufactureExample example);

    int updateByExample(@Param("record") Manufacture record, @Param("example") ManufactureExample example);

    int updateByPrimaryKeySelective(Manufacture record);

    int updateByPrimaryKey(Manufacture record);

    List<Manufacture> selectPageManufacture();

    List<Manufacture> selectPageManufactureById(@Param("searchValueId") String searchValue);

    List<Manufacture> selectManufactureByOrderId(@Param("searchValueOrderId")String s);

    List<Manufacture> selectManufactureByTechnologyName(@Param("searchValueTechnologyName")String s);

    Manufacture selectManufactureByPrimaryKey(@Param("manufactureId") String id);
}