package com.gaole.springmvc.controller;

import com.gaole.springmvc.entity.Item;
import com.gaole.springmvc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 物品类控制器层
 *
 * @author gl
 * @create 2018-01-14-19:50
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * RequestMapping中填写的是请求,与用户发送的url请求进行匹配
     *
     * @return
     */
    @RequestMapping("/itemList.action")
    public ModelAndView queryItemList() {

        List<Item> items = itemService.findAll();

//        创建视图模型对象
        ModelAndView modelAndView = new ModelAndView();
//        给对象中添加查询到的数据
        modelAndView.addObject("list", items);
//        设置返回的JSP视图
        modelAndView.setViewName("/WEB-INF/jsp/list.jsp");

        return modelAndView;
    }
}
