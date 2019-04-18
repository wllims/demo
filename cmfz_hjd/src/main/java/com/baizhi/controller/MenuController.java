package com.baizhi.controller;

import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("selectAll")
    public List<Menu> selectAll() {
        List<Menu> list = menuService.selectAllMenu();
        /*Map map=new HashMap();
        map.put("list",list);*/
        //System.out.println(list);
        return list;
    }
}
