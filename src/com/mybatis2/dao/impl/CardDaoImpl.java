package com.mybatis2.dao.impl;

import com.mybatis2.dao.CardDao;
import com.mybatis2.mapper.CardMapper;
import com.mybatis2.pojo.Idcard;
import com.mybatis2.util.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * 查询指定ID的卡片信息
 * @author GOU
 * @Date 2020-04-22 9:58
 */
@Repository("cardDao")
public class CardDaoImpl implements CardDao {
    SqlSession sqlSession = MyBaitsUtils.getSession();
    CardMapper cardMapper=sqlSession.getMapper(CardMapper.class);
    @Override
    public Idcard findCardById(int id) {
        Idcard idcard=cardMapper.findCaryById(id);
        sqlSession.close();
        return idcard;
    }
}
