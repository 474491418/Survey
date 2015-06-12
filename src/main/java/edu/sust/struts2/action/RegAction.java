package edu.sust.struts2.action;

import edu.sust.po.User;
import edu.sust.service.Interface.UserService;
import edu.sust.util.DataUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by envy15 on 2015/4/10 0010.
 */

/**
 * 注册action
 * prototype表示action是原型bean
 */
@Controller
@Scope("prototype")
public class RegAction extends BaseAction<User> {

    private static final long serialVersionUID = 7940292956596556287L;

    // private String username;

    private String confirm_password;
    //注入用户service
    @Resource
    private UserService userService;

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }


//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }

    private User model = new User();

    /**
     * 到达注册页面
     *
     * @return
     */
    public String toRegPage() {
        return "regPage";
    }

    /**
     * 用户注册
     *
     * @return
     */
    public String doReg() {
        model.setPassWord(DataUtil.md5(model.getPassWord()));//密码加密
        userService.saveEntry(model);
        return "success";
    }

    @Override
    public User getModel() {
        return model;
    }

    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }

    private Map<String, Object> dataMap;

    public String isUserReg() {
        dataMap = new HashMap<String, Object>();
        System.out.println(model.getName());
        boolean result = userService.isUserReg(model.getName());
        dataMap.put("valid", result);
        model.setName(model.getName());
        return "success";

        //测试用
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/Application.xml");
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        String hql = "from User where user_name=?";
//        List<User> entryByHql = userService.findEntryByHql(hql, username);
//        boolean result = false;
//        if (entryByHql.isEmpty()) {
//            result = true;
//        }//ajax后台连接数据看是否注册过


    }


}
