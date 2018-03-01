package cn.ssm.controller;

import cn.ssm.po.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: ItemsController1.java
 * @Description:实现controller接口的处理器
 * @Author 王炳智 
 * @Date 2018/2/28 17:01
 */
public class ItemsController1 implements Controller{
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        //调用service查找数据库，查询商品列表，这里使用静态数据模拟
        List<Items> itemsList = new ArrayList<Items>();

        Items items1 = new Items();
        items1.setName("imac");
        items1.setPrice(66666f);
        items1.setDetail("苹果出品，必属精品");

        Items items2 = new Items();
        items2.setName("mac book");
        items2.setPrice(88888f);
        items2.setDetail("苹果出品，必属精品");

        itemsList.add(items1);
        itemsList.add(items2);

        //返回ModelandView
        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setattribute方法,在jsp页面中取出数据
        modelAndView.addObject("itemsList",itemsList);
        //指定视图
        //下面的路径如果在视图解析器中配置了jsp路径的前缀和后缀，修改为
        //modelAndView.setViewName("/jsp/itemsList.jsp");
        modelAndView.setViewName("itemsList");
        return modelAndView;
    }
}
