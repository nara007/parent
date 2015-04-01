package com.sy.ejbImpl;

import com.sy.ejbInterface.MyStateless;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by root on 15-3-25.
 */
@Stateless
@WebService
public class MyStatelessBean implements MyStateless{

    private int num=1;
    @WebMethod
    @Override
    public int compute() {
        num=num+1;
        System.out.println(num);
        return 0;
    }

    @WebMethod
    @Override
    public int getResult() {
        return this.num;
    }
}
