package com.bj58.fen.test.dao.impl;

import com.bj58.fen.test.dao.DaoTest;
import com.bj58.fen.test.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @author willbee
 */
@Repository("daoTest")
public class DaoTestImpl extends HibernateDaoSupport implements DaoTest {

    @Resource
    SessionFactory sessionFactory;

    @Override
    public void save(Person person) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        session.close();
    }

    @Override
    public Person findPersonById(Serializable id) {

        Person person = getHibernateTemplate().get(Person.class, id);

        return person;
    }


}
