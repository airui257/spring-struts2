package com.bj58.fen.test.service.impl;

import com.bj58.fen.test.dao.DaoTest;
import com.bj58.fen.test.entity.Person;
import com.bj58.fen.test.service.ServiceTest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @author willbee
 */
@Service("serviceTest")
public class ServiceTestImpl implements ServiceTest {

    @Resource
    DaoTest daoTest;

    @Override
    public void say() {
        System.out.println("say hello");
    }

    @Override
    public void save(Person person) {
        daoTest.save(person);
//        int i = 1/0;
    }

    @Override
    public Person findPerson(Serializable id) {
        Person person = daoTest.findPersonById(id);
        return person;
    }
}
