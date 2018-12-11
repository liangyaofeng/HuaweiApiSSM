package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("admin/classify")
public class ClassifyController {

    @Autowired
    ClassifyService classifyService;



    @RequestMapping("/classifyInfopage")
    @ResponseBody
    public R classifyInfopage(@RequestParam(defaultValue ="1")int param1, @RequestParam(defaultValue = "5")int param2){
        return R.ok(classifyService.getClassifyPager(param1,param2));
    }

    @RequestMapping("/classifycount")
    @ResponseBody
    public R classifycount(){
        return R.ok(classifyService.getClassifyCount());
    }



}
