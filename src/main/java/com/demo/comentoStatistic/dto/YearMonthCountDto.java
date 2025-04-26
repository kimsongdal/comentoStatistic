package com.demo.comentoStatistic.dto;

public class YearMonthCountDto {
    String yearMonth;
    int TOTCNT;

    public YearMonthCountDto(String yearMonth, int TOTCNT) {
        this.yearMonth = yearMonth;
        this.TOTCNT = TOTCNT;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public int getTOTCNT() {
        return TOTCNT;
    }

    public void setTOTCNT(int TOTCNT) {
        this.TOTCNT = TOTCNT;
    }

}
