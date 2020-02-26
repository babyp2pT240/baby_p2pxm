package cn.baby_p2p.demo.service;

import cn.baby_p2p.demo.dao.TUserAccountRepository;
import cn.baby_p2p.demo.dao.TUserInfoRepository;
import cn.baby_p2p.demo.dao.TUserWalletRepository;
import cn.baby_p2p.demo.pojo.TUserAccount;
import cn.baby_p2p.demo.pojo.TUserInfo;
import cn.baby_p2p.demo.pojo.TUserWallet;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
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
        TUserAccount tUserAccount = new TUserAccount();
        tUserAccount.setCreateTime(new Date());

        QueryWrapper<TUserAccount> queryWrapper = new QueryWrapper<TUserAccount>();
        queryWrapper.like("username",username);
        List<TUserAccount> tUserAccountList = tUserAccountRepository.selectList(queryWrapper);
        int result = tUserAccountRepository.update(tUserAccount,queryWrapper);
        if (result>0){
            return tUserAccountList.get(0);
        }
        return tUserAccountList.get(0);
    }

    public boolean register(String id,String username,String password){
        TUserAccount tUserAccount = new TUserAccount();
        TUserInfo tUserInfo = new TUserInfo();
        TUserWallet tUserWallet = new TUserWallet();
        boolean faly = false;
        tUserAccount.setId(id);
        tUserAccount.setUsername(username);
        tUserAccount.setPassword(password);
        tUserAccount.setCreateTime(new Date());
        tUserInfo.setAccountId(id);
        tUserInfo.setCreateTime(new Date());
        tUserWallet.setAccountId(id);
        tUserWallet.setCreateTime(new Date());
        int result1 = tUserAccountRepository.insert(tUserAccount);
        int result2 = tUserInfoRepository.insert(tUserInfo);
        int result3 = tUserWalletRepository.insert(tUserWallet);
        if (result1>0&&result2>0&&result3>0){
            faly = true;
        }
        return faly;
    }

    public TUserInfo getTUserInfo(String id){
        QueryWrapper<TUserInfo> queryWrapper = new QueryWrapper<TUserInfo>();
        queryWrapper.like("account_id",id);
        List<TUserInfo> tUserInfoList = tUserInfoRepository.selectList(queryWrapper);
        return  tUserInfoList.get(0);
    }

    public TUserWallet getTUserWallet(String id){
        QueryWrapper<TUserWallet> queryWrapper = new QueryWrapper<TUserWallet>();
        queryWrapper.like("account_id",id);
        List<TUserWallet> tUserWalletList = tUserWalletRepository.selectList(queryWrapper);
        return  tUserWalletList.get(0);
    }

}
