package cn.ssm.controller;

import cn.ssm.po.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * @Title: ItemsController3.java
 * @Description:使用注解的handler
 * @Author 王炳智
 * @Date 2018/3/1 16:16
 */
//使用@Controller标示他是一个控制器
@Controller
public class ItemsController3 {
    // @RequestMapping实现对queryItems方法和url进行映射，一个方法对应一个url,一般建议将url和方法名写成一样
    @RequestMapping("/queryItems")
    //商品查询列表
    public ModelAndView queryItems() throws Exception {
        List<Items> itemsList = new ArrayList<Items>();

        Items items1 = new Items();
        items1.setName("macbook pro 15");
        items1.setPrice(66666f);
        items1.setDetail("强大的笔记本电脑");

        Items items2 = new Items();
        items2.setName("macbook pro 13");
        items2.setPrice(88888f);
        items2.setDetail("苹果出品，必属精品");

        itemsList.add(items1);
        itemsList.add(items2);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList", itemsList);
        modelAndView.setViewName("itemsList");

        return modelAndView;


   /* @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        List<Items> itemsList = new ArrayList<Items>();

        Items items1 = new Items();
        items1.setName("macbook pro 15");
        items1.setPrice(66666f);
        items1.setDetail("强大的笔记本电脑");

        Items items2 = new Items();
        items2.setName("mac book");
        items2.setPrice(88888f);
        items2.setDetail("苹果出品，必属精品");

        itemsList.add(items1);
        itemsList.add(items2);
        //设置模型数据
        httpServletRequest.setAttribute("itemsList",itemsList);

        httpServletRequest.getRequestDispatcher("/jsp/itemsList.jsp").forward(httpServletRequest,httpServletResponse);

*//*        //使用下面的这个方法可以通过修改response,设置响应的数据格式，比如响应json数据
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setContentType("application/json;charset=utf-8");
        httpServletResponse.getWriter().write("json串");*//*
         */

    }
}
