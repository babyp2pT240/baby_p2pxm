package cn.baby_p2p.demo.service;

import cn.baby_p2p.demo.dao.TBankCardRepository;
import cn.baby_p2p.demo.dao.TUserAccountRepository;
import cn.baby_p2p.demo.dao.TUserInfoRepository;
import cn.baby_p2p.demo.dao.TUserWalletRepository;
import cn.baby_p2p.demo.pojo.TBankCard;
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

    @Resource
    private TBankCardRepository tBankCardRepository;

    public TUserAccount login(String username){
        TUserAccount tUserAccount = new TUserAccount();
        tUserAccount.setLastLoginTime(new Date());
        QueryWrapper<TUserAccount> queryWrapper = new QueryWrapper<TUserAccount>();
        queryWrapper.like("username",username);
        List<TUserAccount> tUserAccountList = tUserAccountRepository.selectList(queryWrapper);
        int result = tUserAccountRepository.update(tUserAccount,queryWrapper);
        if (result>0){
            return tUserAccountList.get(0);
        }
        if(tUserAccountList.size()==0){
            return null;
        }else {
            return tUserAccountList.get(0);
        }
    }

    public boolean register(String id,String username,String password){
        TUserAccount tUserAccount = new TUserAccount();
        TUserInfo tUserInfo = new TUserInfo();
        TUserWallet tUserWallet = new TUserWallet();
        boolean faly = false;
        tUserAccount.setId(id);
        tUserAccount.setUsername(username);
        tUserAccount.setPassword(password);
        tUserAccount.setAccountStatus(1);
        tUserAccount.setAccountType(1);
        tUserAccount.setCreateTime(new Date());
        tUserInfo.setAccountId(id);
        tUserInfo.setCreateTime(new Date());
        tUserWallet.setAccountId(id);
        tUserWallet.setCreateTime(new Date());
        tUserInfo.setAvatar("nobody.jpg");
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

    public TBankCard getTBankCard(String id){
        QueryWrapper<TBankCard> queryWrapper = new QueryWrapper<TBankCard>();
        queryWrapper.like("user_id",id);
        List<TBankCard> tBankCardList = tBankCardRepository.selectList(queryWrapper);
        if (tBankCardList.size()==0){
            return  null;
        }else {
            return tBankCardList.get(0);
        }
    }

    public boolean addTBankCard(TBankCard tBankCard){
        boolean faly = false;
        int result = tBankCardRepository.insert(tBankCard);
        if (result>0){
            faly = true;
        }
        return  faly;
    }

    public boolean updateUserinfo(TUserInfo tUserInfo){
        boolean faly = false;
        QueryWrapper<TUserInfo> queryWrapper = new QueryWrapper<TUserInfo>();
        queryWrapper.like("account_id",tUserInfo.getAccountId());
        int result = tUserInfoRepository.update(tUserInfo,queryWrapper);
        if (result>0){
            faly = true;
        }
        return  faly;
    }

    public boolean updateUserAccount(TUserAccount tUserAccount){
        boolean faly = false;
        QueryWrapper<TUserAccount> queryWrapper = new QueryWrapper<TUserAccount>();
        queryWrapper.like("id",tUserAccount.getId());
        int result = tUserAccountRepository.update(tUserAccount,queryWrapper);
        if (result>0){
            faly = true;
        }
        return  faly;
    }
}
