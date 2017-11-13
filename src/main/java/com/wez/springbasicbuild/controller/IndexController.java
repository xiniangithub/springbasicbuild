package com.wez.springbasicbuild.controller;

import com.wez.springbasicbuild.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/toIndex")
    public ModelAndView toIndex() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("currentTime", indexService.queryForList());
        return mav;
    }

    @RequestMapping("/queryForList")
    public @ResponseBody List<Map<String, Object>> queryForList() {
        return indexService.queryForList();
    }

}
