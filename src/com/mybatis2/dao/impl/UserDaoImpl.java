package com.mybatis2.dao.impl;

import com.mybatis2.dao.UserDao;
import com.mybatis2.mapper.UserMapper;
import com.mybatis2.pojo.User;
import com.mybatis2.util.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * 一对多查询Dao层
 * @author GOU
 * @Date 2020-04-22 15:23
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    SqlSession sqlSession = MyBaitsUtils.getSession();
    UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
    @Override
    public User findUserWithOrders(int value) {
        User user=userMapper.findUserWithOrders(value);
        sqlSession.close();
        return user;
    }
}
