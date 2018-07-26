package com.jarq.beans;

import javax.ejb.Stateless;

@Stateless
public class StatelessHelloBean implements StatelessHello {

    @Override
    public String getHello() {
        return "Hello!";
    }
}
