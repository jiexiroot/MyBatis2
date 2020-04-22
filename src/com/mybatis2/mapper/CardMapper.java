package com.mybatis2.mapper;

import com.mybatis2.pojo.Idcard;
import org.apache.ibatis.annotations.Param;

/**
 * @author GOU
 * @Date 2020-04-22 9:59
 */
public interface CardMapper {
    /**
     * 根据id得到对应的IdCard
     * @param value Id值
     * @return 返回Idcard对象
     */
    Idcard findCaryById(@Param("id")int value);
}
