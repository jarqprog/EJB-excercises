package com.jarq.beans;

import javax.ejb.Remote;

@Remote
public interface RegularDate {

    String getDate();
}
