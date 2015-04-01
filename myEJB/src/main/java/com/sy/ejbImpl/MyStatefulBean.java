package com.sy.ejbImpl;

import com.sy.ejbInterface.MyStateful;

import javax.ejb.Remote;
import javax.ejb.Stateful;

/**
 * Created by root on 15-3-25.
 */
@Stateful
@Remote
public class MyStatefulBean implements MyStateful{
    private int num;
    @Override
    public int compute() {
        this.num++;
        return 0;
    }

    @Override
    public int getResult() {
        return this.num;
    }
}
