package com.jarq.beans;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import java.time.LocalDateTime;

@Singleton
public class SingletonDateBean implements SingletonDate {

    private LocalDateTime dateTime;

    @Override
    @Lock(LockType.READ)
    public String getDate() {
        if (dateTime == null) {
            dateTime = LocalDateTime.now();
        }

        return "I was created at: " + dateTime.toString();
    }
}
