package com.cool.amoy.demo.mybatis.xml.dao;
import com.cool.amoy.demo.mybatis.xml.domain.City;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Component;

/**
 * @author Eddú Meléndez
 */
@Component
public class CityDao {

    private final SqlSession sqlSession;

    public CityDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public City selectCityById(long id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }

}