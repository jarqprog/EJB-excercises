package com.jarq.beans;

import javax.ejb.Stateless;
import java.util.Random;

@Stateless
public class RandomNumberBean implements RandomNumber {

    @Override
    public int getNumber() {

        Random chaos = new Random();
        return chaos.nextInt();
    }
}
