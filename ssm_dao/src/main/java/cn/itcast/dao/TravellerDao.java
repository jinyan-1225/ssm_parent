package cn.itcast.dao;

import cn.itcast.domain.Traveller;
import org.apache.ibatis.annotations.Select;

public interface TravellerDao {
    @Select("select * from  Traveller where  id in (select travellerid from order_traveller where orderid = #{orderid})")
    public Traveller findByOrdersId(String ordersId) throws Exception;
}
