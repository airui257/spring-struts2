package com.bj58.fen.test.action;

import com.bj58.fen.test.service.ServiceTest;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;

public class ActionTest extends ActionSupport {

    @Resource
    ServiceTest serviceTest;

    @Override
    public String execute() throws Exception {
        System.out.println("this = " + this);
        System.out.println("serviceTest = " + serviceTest);
        serviceTest.say();
        return SUCCESS;
    }

    public String testSay(){
        System.out.println("this = " + this);
        System.out.println("serviceTest = " + serviceTest);
        serviceTest.say();
        return SUCCESS;
    }
}
