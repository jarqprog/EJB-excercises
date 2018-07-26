package com.jarq.beans;

import javax.ejb.Stateful;
import java.time.LocalDateTime;

@Stateful
public class RegularDateBean implements RegularDate {

    private LocalDateTime dateTime;

    @Override
    public String getDate() {

        if (dateTime == null) {
            dateTime = LocalDateTime.now();
        }
        return "I was created at: " + dateTime.toString();
    }
}
