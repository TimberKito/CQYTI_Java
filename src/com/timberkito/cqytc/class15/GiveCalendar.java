package com.timberkito.cqytc.class15;

import java.time.*;

public class GiveCalendar {
    public LocalDate[] getCalendar(LocalDate date) {
        date = date.withDayOfMonth(1);
        int days = date.lengthOfMonth();
        LocalDate dataArrays[] = new LocalDate[days];
        for (int i = 0; i < days; i++) {
            dataArrays[i] = date.plusDays(i);
        }

        return dataArrays;
    }
}
