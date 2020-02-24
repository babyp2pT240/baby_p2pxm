package cn.baby_p2p.demo.service;

import cn.baby_p2p.demo.dao.TUserAccountRepository;
import cn.baby_p2p.demo.dao.TUserInfoRepository;
import cn.baby_p2p.demo.dao.TUserWalletRepository;
import cn.baby_p2p.demo.pojo.TUserAccount;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private TUserAccountRepository tUserAccountRepository;

    @Resource
    private TUserInfoRepository tUserInfoRepository;

    @Resource
    private TUserWalletRepository tUserWalletRepository;

    public TUserAccount login(String username){
        QueryWrapper<TUserAccount> queryWrapper = new QueryWrapper<TUserAccount>();
        queryWrapper.like("username",username);
        List<TUserAccount> tUserAccountList = tUserAccountRepository.selectList(queryWrapper);
        return tUserAccountList.get(0);
    }

}
