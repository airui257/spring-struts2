package com.bj58.fen.test.service;

import com.bj58.fen.test.entity.Person;

import java.io.Serializable;

public interface ServiceTest {

    void say();

    void save(Person person);

    Person findPerson(Serializable id);
}
