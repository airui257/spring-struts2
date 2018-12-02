package com.bj58.fen.test.service.impl;

import com.bj58.fen.test.service.ServiceTest;
import org.springframework.stereotype.Service;

/**
 * @author willbee
 */
@Service("serviceTest")
public class ServiceTestImpl implements ServiceTest {

    @Override
    public void say() {
        System.out.println("say hello");
    }

}
