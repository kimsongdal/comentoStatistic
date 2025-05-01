package com.demo.comentoStatistic.controller;

import com.demo.comentoStatistic.dto.YearCountDto;
import com.demo.comentoStatistic.dto.YearMonthDto;
import com.demo.comentoStatistic.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestController {

    @Autowired
    RequestService requestService;

    @RequestMapping(value = "/rest/logins/{yearMonth}" , produces = "application/json")
    @ResponseBody
    public ResponseEntity<Object> getYearMonthCount(@PathVariable("yearMonth") String yearMonth){
        return ResponseEntity.ok(requestService.selectYearMonth(yearMonth));
    }

    @RequestMapping(value = "/rest/logins/{yearMonth}/{department}" , produces = "application/json")
    @ResponseBody
    public ResponseEntity<Object> getYearMonthCountByDepartment(@PathVariable("yearMonth") String yearMonth, @PathVariable("department") String department){
        return ResponseEntity.ok(requestService.selectYearMonthByDepartment(yearMonth, department));
    }

}
