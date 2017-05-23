package com.haiyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import po.Items;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hhy on 2017/5/20.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        List<Items> items=new ArrayList<Items>();
        Items items1=new Items();
        items1.setName("联想");
        items1.setPrice(5000f);
        items1.setDetail("ThinkPad 3234");

        Items items2=new Items();
        items2.setName("Dell");
        items2.setPrice(7000f);
        items2.setDetail("XPS2017 ");

        items.add(items1);
        items.add(items2);
        model.addAttribute(items);
        return "spittles";
    }
}
