package com.mybatis2.mapper;

import com.mybatis2.pojo.Orders2;
import org.apache.ibatis.annotations.Param;

/**
 * @author GOU
 * @Date 2020-04-22 16:09
 */
public interface OrdersMapper {
    /**
     * 多对多嵌套查询，通过订单ID来查询订单查询
     * @param value 查询ID值
     * @return 返回订单及其商品对象
     */
    Orders2 findOrdersWithProduct(@Param("id")int value);
    /**
     * 多对多嵌套结果查询，通过订单ID来查询订单查询
     * @param value 查询ID值
     * @return 返回订单及其商品对象
     */
    Orders2 findOrdersWithProduct2(@Param("id")int value);
}
