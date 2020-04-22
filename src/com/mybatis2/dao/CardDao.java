package com.mybatis2.dao;

import com.mybatis2.pojo.Idcard;

/**
 * @author GOU
 * @Date 2020-04-22 9:57
 */
public interface CardDao {
    /**
     * 根据id得到对应的IdCard
     * @param id Id值
     * @return 返回Idcard对象
     */
    Idcard findCardById(int id);
}
