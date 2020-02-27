package cn.baby_p2p.demo.controller;

import cn.baby_p2p.demo.pojo.TBankCard;
import cn.baby_p2p.demo.pojo.TUserAccount;
import cn.baby_p2p.demo.pojo.TUserInfo;
import cn.baby_p2p.demo.pojo.TUserWallet;
import cn.baby_p2p.demo.service.UserService;
import cn.baby_p2p.demo.tools.Item;
import cn.baby_p2p.demo.tools.MD5Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    private MD5Utils md5Utils;

    private Item items;

    @PostMapping("/login")
    @ResponseBody
    public Object login(@RequestParam("username")String username, @RequestParam("password")String password){
        Map map = new HashMap<String,Object>();
        TUserAccount tUserAccount = userService.login(username);
        String passwordmd5 = md5Utils.toMD5(password);
        if (tUserAccount==null){
            map.put("code","400");
            map.put("msg","用户不存在");
        }else if (!username.equals(tUserAccount.getUsername())){
            map.put("code","400");
            map.put("msg","用户名错误");
        }else if (!passwordmd5.equals(tUserAccount.getPassword())){
            map.put("code","400");
            map.put("msg","密码错误");
        }else {
            map.put("code","200");
            map.put("data",tUserAccount);
        }
        return map;
    }

    @PostMapping("/checkUsername")
    @ResponseBody
    public Object checkUsername(@RequestParam("username")String username){
        boolean faly = false;
        TUserAccount tUserAccount = userService.login(username);
        if (tUserAccount == null){
            faly = true;
        }else {
            faly = false;
        }
        return faly;
    }

    @PostMapping("/register")
    @ResponseBody
    public Object register(@RequestParam("username")String username, @RequestParam("password")String password){
        String id = items.getItemID(32);
        Map map = new HashMap<String,Object>();
        String password5 = MD5Utils.toMD5(password);
        boolean faly = userService.register(id,username,password5);
        if (faly){
            map.put("code","200");
        }else {
            map.put("code","400");
            map.put("msg","添加失败");
        }
        return map;
    }

    @PostMapping("/userinfo/get/{id}")
    @ResponseBody
    public Object userinfoget(@PathVariable("id")String id){
        Map map = new HashMap<String,Object>();
        TUserInfo tUserInfo = userService.getTUserInfo(id);
        if (tUserInfo==null){
            map.put("code","400");
            map.put("msg","查询失败");
        }else{
            map.put("code","200");
            map.put("data",tUserInfo);
        }
        return  map;
    }



    @PostMapping("/wallet/get/{id}")
    @ResponseBody
    public Object walletget(@PathVariable("id")String id){
        Map map = new HashMap<String,Object>();
        TUserWallet tUserWallet = userService.getTUserWallet(id);
        if (tUserWallet==null){
            map.put("code","400");
            map.put("msg","查询失败");
        }else {
            map.put("code","200");
            map.put("data",tUserWallet);
        }
        return  map;
    }

    @PostMapping("/bankcard/get/{id}")
    @ResponseBody
    public Object bankecardget(@PathVariable("id")String id){
        Map map = new HashMap<String,Object>();
        TBankCard tBankCard = userService.getTBankCard(id);
        if (tBankCard==null){
            map.put("code","404");
        }else {
            map.put("code","200");
            map.put("data",tBankCard);
        }
        return map;
    }

    @PostMapping("/bankcard/add")
    @ResponseBody
    public Object bankcardadd(@RequestParam("userId")String userId,@RequestParam("realname")String realname,@RequestParam("cardNumber")String cardNumber,
                              @RequestParam("bankName")String bankName,@RequestParam("branchName")String branchName){
        Map map = new HashMap<String,Object>();
        String id = items.getItemID(32);
        TBankCard tBankCard = new TBankCard();
        tBankCard.setId(id);
        tBankCard.setUserId(userId);
        tBankCard.setRealname(realname);
        tBankCard.setCardNumber(cardNumber);
        tBankCard.setBankName(bankName);
        tBankCard.setBranchName(branchName);
        tBankCard.setCreateTime(new Date());
        if (userService.addTBankCard(tBankCard)){
            map.put("code","200");
        }else {
            map.put("code","400");
            map.put("msg","添加失败");
        }
        return map;
    }
}
