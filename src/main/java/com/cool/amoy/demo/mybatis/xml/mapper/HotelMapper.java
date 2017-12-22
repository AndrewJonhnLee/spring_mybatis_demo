package com.cool.amoy.demo.mybatis.xml.mapper;

import com.cool.amoy.demo.mybatis.xml.domain.Hotel;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author Eduardo Macarron
 */
@Mapper
public interface HotelMapper {

    Hotel selectByCityId(int city_id);

}