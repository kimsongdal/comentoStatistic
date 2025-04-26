package com.demo.comentoStatistic.dto;

public class YearCountDto {
    String year;
    int TOTCNT;

    public YearCountDto(String year, int TOTCNT) {
        this.year = year;
        this.TOTCNT = TOTCNT;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getTOTCNT() {
        return TOTCNT;
    }

    public void setTOTCNT(int TOTCNT) {
        this.TOTCNT = TOTCNT;
    }
}
