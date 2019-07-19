package cn.itcast.service;

import cn.itcast.domain.Product;

import java.util.List;

public interface ProductService {
    /**
     * 查询所有的方法
     *
     * @return
     * @throws Exception
     */
    public List<Product> findAll() throws Exception;

    /**
     * 添加的方法
     * @param product
     * @return
     */
    public void save(Product product);
}
