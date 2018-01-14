package com.gaole.springmvc.service;

import com.gaole.springmvc.entity.Item;

import java.util.List;

/**
 * 商品业务层接口
 *
 * @author Administrator
 */
public interface ItemService {
    /**
     * 查询所有商品信息
     *
     * @return
     */
    List<Item> findAll();
}
