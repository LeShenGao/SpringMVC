package com.gaole.springmvc.mapper;

import com.gaole.springmvc.entity.Item;

import java.util.List;

/**
 * item动态代理接口
 *
 * @author Administrator
 */
public interface ItemMapper {

    /**
     * 查询所有商品信息
     *
     * @return
     */
    public List<Item> findAll();
}
