package cn.itcast.service;


import cn.itcast.domain.Orders;

import java.util.List;

public interface OrdersService {


    List<Orders> findAll(int page, int pageSize) throws Exception;


    public Orders findById(String ordersId) throws Exception;


}
