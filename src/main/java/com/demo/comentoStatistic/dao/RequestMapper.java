package com.demo.comentoStatistic.dao;


import com.demo.comentoStatistic.dto.YearMonthDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RequestMapper {
    YearMonthDto selectYearMonth(String yearMonth);
    YearMonthDto selectYearMonthByDepartment(String yearMonth,String department);
}