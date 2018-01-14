package com.gaole.springmvc.test;

import com.gaole.springmvc.entity.Item;
import com.gaole.springmvc.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author gl
 * @create 2018-01-14-21:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springmvc.xml")
public class SpringMVCTest {

    @Autowired
    private ItemService itemService;

    @Test
    public void name() {
        List<Item> items = itemService.findAll();
        for (Item item : items) {
            System.out.println(item);
        }

    }
}
