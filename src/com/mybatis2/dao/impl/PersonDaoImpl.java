package com.mybatis2.dao.impl;

import com.mybatis2.dao.PersonDao;
import com.mybatis2.mapper.PersonMapper;
import com.mybatis2.pojo.Person;
import com.mybatis2.util.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * 一对一查询Dao层
 * @author GOU
 * @Date 2020-04-22 9:58
 */
@Repository("personDao")
public class PersonDaoImpl implements PersonDao {
    SqlSession sqlSession= MyBaitsUtils.getSession();
    PersonMapper personMapper=sqlSession.getMapper(PersonMapper.class);
    @Override
    public Person findPersonById(int id) {
        Person person=personMapper.findPersonById(id);
        sqlSession.close();
        return person;
    }
    @Override
    public Person findPersonById2(int id) {
        Person person=personMapper.findPersonById2(id);
        sqlSession.close();
        return person;
    }
}
