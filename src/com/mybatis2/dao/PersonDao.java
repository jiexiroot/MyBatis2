package com.mybatis2.dao;

import com.mybatis2.pojo.Person;

/**
 * @author GOU
 * @Date 2020-04-22 9:58
 */
public interface PersonDao {
    /**
     * 根据id，查询个人信息 嵌套查询语句
     * @param value 用户id值
     * @return 返回person对象包含cardid对象
     */
    Person findPersonById(int value);
    /**
     * 根据id，查询个人信息 嵌套结果查询
     * @param value 用户id值
     * @return 返回person对象包含cardid对象
     */
    Person findPersonById2(int value);
}
