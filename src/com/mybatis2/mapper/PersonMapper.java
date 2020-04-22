package com.mybatis2.mapper;

import com.mybatis2.pojo.Person;
import org.apache.ibatis.annotations.Param;

/**
 * @author GOU
 * @Date 2020-04-22 10:00
 */
public interface PersonMapper {
    /**
     * 根据id，查询个人信息 嵌套查询语句
     * @param value 用户id值
     * @return 返回person对象包含cardid对象
     */
    Person findPersonById(@Param("id")int value);
    /**
     * 根据id，查询个人信息 嵌套结果查询
     * @param value 用户id值
     * @return 返回person对象包含cardid对象
     */
    Person findPersonById2(@Param("id")int value);
}
