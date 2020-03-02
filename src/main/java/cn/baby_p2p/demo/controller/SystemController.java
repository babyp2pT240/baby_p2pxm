package cn.baby_p2p.demo.controller;

import cn.baby_p2p.demo.pojo.TSystemDictionaryItem;
import cn.baby_p2p.demo.service.SystemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/system")
public class SystemController {

    @Resource
    private SystemService systemService;


    @GetMapping("/dictionaryItem/getAll")
    @ResponseBody
    public Object getAll(){
        Map map = new HashMap<String,Object>();
        List<TSystemDictionaryItem> tSystemDictionaryItemList = systemService.getTSystemDictionaryItem();
        if (tSystemDictionaryItemList==null){
            map.put("code","400");
            map.put("msg","查询错误");
        }else {
            map.put("code","200");
            map.put("data",tSystemDictionaryItemList);
        }
        return map;
    }

    @PostMapping("/recharge/add")
    @ResponseBody
    public Object addrecharge(){
        Map map = new HashMap<String,Object>();
        
        return map;
    }
}
