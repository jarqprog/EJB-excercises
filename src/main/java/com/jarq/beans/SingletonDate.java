package com.jarq.beans;

import javax.ejb.Remote;

@Remote
public interface SingletonDate {
    String getDate();
}
