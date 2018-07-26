package com.jarq.beans;

import javax.ejb.Remote;

@Remote
public interface RandomNumber {

    int getNumber();

}
