package com.gaole.springmvc.controller;

import com.gaole.springmvc.entity.Item;
import com.gaole.springmvc.entity.QueryVo;
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
        modelAndView.setViewName("list");

        return modelAndView;
    }

    /**
     * 根据id查询商品信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/item/editItem.action")
    public ModelAndView findById(Integer id) {
        Item item = itemService.findById(id);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("item", item);
        modelAndView.setViewName("editItem");

        return modelAndView;
    }

    /**
     * 根据前台表单传递的参数,进行对数据的修改
     * 主要是根据商品的编号进行商品的修改
     *
     * @param item
     * @return
     */
    @RequestMapping("/item/updateItem.action")
    public ModelAndView updateItem(Item item) {

        itemService.updateItem(item);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }

    /**
     * 根据包装类信息,查询商品信息
     * @param queryVo
     * @return
     */
    @RequestMapping("/item/select.action")
    public ModelAndView queryVo(QueryVo queryVo){

        List<Item> items = itemService.selectItem(queryVo);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",items);
        modelAndView.setViewName("list");
        return modelAndView;
    }
}
