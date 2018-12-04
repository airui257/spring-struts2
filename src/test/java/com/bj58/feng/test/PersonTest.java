package com.bj58.feng.test;

import com.bj58.fen.test.entity.Person;
import com.bj58.fen.test.service.ServiceTest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    ApplicationContext context;

    @Before
    public void before(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void serviceTest(){
        ServiceTest serviceTest = (ServiceTest) context.getBean("serviceTest");
        serviceTest.say();
    }

    @Test
    public void sessionFactoryTest(){
        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        session.save(new Person("男人"));
        transaction.commit();

        session.close();
    }

    @Test
    public void daoTest(){
        ServiceTest serviceTest = (ServiceTest) context.getBean("serviceTest");
        serviceTest.save(new Person("女人"));
    }

    @Test
    public void findPersonByIdTest(){
        ServiceTest serviceTest = (ServiceTest) context.getBean("serviceTest");
        Person person = serviceTest.findPerson("4028818a676f794b01676f794dfa0000");
        System.out.println("person = " + person);
    }

    @Test
    public void transactionTest(){
        ServiceTest serviceTest = (ServiceTest) context.getBean("serviceTest");
        serviceTest.save(new Person("神人"));
    }
}
