package com.mybatis2.dao.impl;

import com.mybatis2.dao.OrdersDao;
import com.mybatis2.mapper.OrdersMapper;
import com.mybatis2.pojo.Orders;
import com.mybatis2.pojo.Orders2;
import com.mybatis2.util.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * 多对多查询Dao层
 * @author GOU
 * @Date 2020-04-22 16:33
 */
@Repository("ordersDao")
public class OrdersDaoImpl implements OrdersDao {
    SqlSession sqlSession = MyBaitsUtils.getSession();
    OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
    @Override
    public Orders2 findOrdersWithProduct(int value) {
        Orders2 orders=ordersMapper.findOrdersWithProduct(value);
        sqlSession.close();
        return orders;
    }

    @Override
    public Orders2 findOrdersWithProduct2(int value) {
        Orders2 orders=ordersMapper.findOrdersWithProduct2(value);
        sqlSession.close();
        return orders;
    }
}
