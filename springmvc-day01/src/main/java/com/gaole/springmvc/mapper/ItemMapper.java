package com.gaole.springmvc.mapper;

import com.gaole.springmvc.entity.Item;
import com.gaole.springmvc.entity.QueryVo;

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

    /**
     * 根据商品id,查询商品信息
     *
     * @param id
     * @return
     */
    Item findById(Integer id);

    /**
     * 根据前台传递的商品信息然后对指定的id进行修改
     *
     * @param item
     */
    void updateItem(Item item);

    /**
     * 根据商品id和名称进行数据的查询
     *
     * @param queryVo
     * @return
     */
    List<Item> selectItem(QueryVo queryVo);
}
