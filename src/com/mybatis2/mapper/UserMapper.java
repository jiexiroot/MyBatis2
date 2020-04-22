package com.mybatis2.mapper;

import com.mybatis2.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author GOU
 * @Date 2020-04-22 14:51
 */
public interface UserMapper {
    /**
     * 通过查询用户，一对多关系，把用户的订单信息一般查询出来
     * @param value 查询用户的Id值
     * @return 返回user及其orders信息
     */
    User findUserWithOrders(@Param("id")int value);
}
