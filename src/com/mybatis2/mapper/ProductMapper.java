package com.mybatis2.mapper;

import com.mybatis2.pojo.Product;
import org.apache.ibatis.annotations.Param;

/**
 * @author GOU
 * @Date 2020-04-22 16:17
 */
public interface ProductMapper {
    /**
     * 多对多查询中的子查询，用来通过订单表id来查询商品表的商品具体信息
     * @param value 查询ID值
     * @return 返回商品对象
     */
    Product findProductById(@Param("id")int value);
}
