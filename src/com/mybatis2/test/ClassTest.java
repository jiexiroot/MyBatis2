package com.mybatis2.test;

import com.mybatis2.dao.OrdersDao;
import com.mybatis2.dao.PersonDao;
import com.mybatis2.dao.UserDao;
import com.mybatis2.pojo.Orders2;
import com.mybatis2.pojo.Person;
import com.mybatis2.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @author GOU
 * @Date 2020-04-22 9:51
 */
public class ClassTest {
    ApplicationContext context=new ClassPathXmlApplicationContext("com/mybatis2/applicationContext.xml");
    UserDao userDao =(UserDao) context.getBean("userDao");
    PersonDao personDao = (PersonDao) context.getBean("personDao");
    OrdersDao ordersDao = (OrdersDao) context.getBean("ordersDao");
    Scanner inputScanner=new Scanner(System.in);
    @Test
    public void domain(){
        System.out.println("请输入你所要执行的查询操作\n1:一对一查询\n2:一对多查询\n3:多对多查询\n4:执行所有查询");
        String chooseId = inputScanner.next();
        switch (chooseId){
            case "1":
                selectToOne();
                break;
            case "2":
                selectToTwo();
                break;
            case "3":
                selectToThree();
                break;
            case "4":
                System.out.println("一对一查询：");
                selectToOne();
                System.out.println("一对多查询：");
                selectToTwo();
                System.out.println("多对多查询：");
                selectToThree();
                break;
            default:
                System.out.println("错误的输入参数");
        }
    }
    /**
     * 一对一查询 association标签查询 嵌套查询语句 由javaType类型设置传入参数
     */
    @Test
    public void selectToOne(){
        Person person=personDao.findPersonById(2);
        System.out.println(person);
    }
    /**
     * 一对一查询 association标签查询 嵌套结果查询 由javaType类型设置传入参数
     */
    @Test
    public void selectToOne2(){
        Person person=personDao.findPersonById2(2);
        System.out.println(person);
    }
    /**
     * 一对多查询 collection标签查询 由ofType类型设置传入参数
     */
    @Test
    public void selectToTwo(){
        User user=userDao.findUserWithOrders(1);
        System.out.println(user);
    }
    /**
     * 多对多查询 collection标签查询 嵌套查询语句 由ofType类型设置传入参数
     */
    @Test
    public void selectToThree(){
        Orders2 orders=ordersDao.findOrdersWithProduct(1);
        System.out.println(orders);
    }
    /**
     * 多对多查询 collection标签查询 嵌套查询语句 由ofType类型设置传入参数
     */
    @Test
    public void selectToThree2(){
        Orders2 orders=ordersDao.findOrdersWithProduct2(1);
        System.out.println(orders);
    }

}
