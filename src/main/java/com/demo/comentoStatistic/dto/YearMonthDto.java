package com.demo.comentoStatistic.dto;

public class YearMonthDto {

    String yearMonth;
    String department;
    int TOTCNT;

    public void YearCountDto(String yearMonth){
        this.yearMonth = yearMonth;
    }

    public void YearCountDto(String yearMonth,String department){
        this.yearMonth = yearMonth;
        this.department = department;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public String getDepartment() {
        return department;
    }

    public int getTOTCNT() {
        return TOTCNT;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTOTCNT(int TOTCNT) {
        this.TOTCNT = TOTCNT;
    }
}
