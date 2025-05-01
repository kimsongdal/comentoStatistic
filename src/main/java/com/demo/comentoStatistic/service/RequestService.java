package com.demo.comentoStatistic.service;

import com.demo.comentoStatistic.dao.RequestMapper;
import com.demo.comentoStatistic.dto.YearMonthDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class RequestService {

    @Autowired
    RequestMapper requestMapper;

    public HashMap<String,Object> selectYearMonth(String yearMonth){
        HashMap<String,Object> result = new HashMap<>();
        try{
            System.out.println(yearMonth);
            YearMonthDto dto = requestMapper.selectYearMonth(yearMonth);
            result.put("is_success","true");
            result.put("requestlog","L");
            result.put("yearMonth",dto.getYearMonth());
            result.put("TOTCNT",dto.getTOTCNT());
        }catch (Exception e){
            e.fillInStackTrace();
        }
        return result;
    }

    public HashMap<String,Object> selectYearMonthByDepartment(String yearMonth,String department){
        HashMap<String,Object> result = new HashMap<>();
        try{
            YearMonthDto dto = requestMapper.selectYearMonthByDepartment(yearMonth, department);
            result.put("is_success","true");
            result.put("requestlog","L");
            result.put("yearMonth",dto.getYearMonth());
            result.put("department",dto.getDepartment());
            result.put("TOTCNT",dto.getTOTCNT());
        }catch (Exception e){
            e.fillInStackTrace();
        }
        return result;
    }

}
