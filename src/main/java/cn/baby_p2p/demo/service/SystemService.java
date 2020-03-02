package cn.baby_p2p.demo.service;

import cn.baby_p2p.demo.dao.TSystemDictionaryItemRepository;
import cn.baby_p2p.demo.dao.TSystemDictionaryRepository;
import cn.baby_p2p.demo.pojo.TSystemDictionaryItem;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class SystemService {
    @Resource
    private TSystemDictionaryRepository tSystemDictionaryRepository;

    @Resource
    private TSystemDictionaryItemRepository tSystemDictionaryItemRepository;

    public List<TSystemDictionaryItem> getTSystemDictionaryItem(){
        QueryWrapper<TSystemDictionaryItem> queryWrapper = new QueryWrapper<TSystemDictionaryItem>();
        List<TSystemDictionaryItem> tSystemDictionaryItemList = tSystemDictionaryItemRepository.selectList(queryWrapper);
        return tSystemDictionaryItemList;
    }
}
