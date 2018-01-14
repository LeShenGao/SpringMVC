package com.gaole.springmvc.service.impl;

import com.gaole.springmvc.entity.Item;
import com.gaole.springmvc.mapper.ItemMapper;
import com.gaole.springmvc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品业务层实现类
 *
 * @author gl
 * @create 2018-01-14-20:31
 */
@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;


    public List<Item> findAll() {
        return itemMapper.findAll();
    }
}
