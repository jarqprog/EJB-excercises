package com.jarq.beans;

import javax.ejb.Stateless;

@Stateless
public class MyLocalBean implements MyLocal {

    public String expressYourself() {
        return "I'm locally called :) ";
    }
}
