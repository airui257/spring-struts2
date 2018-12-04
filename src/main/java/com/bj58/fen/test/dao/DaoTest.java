package com.bj58.fen.test.dao;

import com.bj58.fen.test.entity.Person;

import java.io.Serializable;

public interface DaoTest {

    void save(Person person);

    Person findPersonById(Serializable id);
}
