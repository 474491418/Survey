package edu.sust.test.UserService;

import edu.sust.po.Survey;
import edu.sust.po.User;
import edu.sust.service.Interface.SurveyService;
import edu.sust.service.Interface.UserService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * Created by envy15 on 2015/4/8 0008.
 */
public class TestUserService {
    private static UserService us;

    private static SurveyService surveyService;

    @BeforeClass
    public static void init() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/Application.xml");
        us = (UserService) applicationContext.getBean("userService");
        surveyService = (SurveyService) applicationContext.getBean("surveyService");
    }

    @Test
    public void test() {
        String hql = "from User where user_name=?";
        List<User> entryByHql = us.findEntryByHql(hql, "zhangsan");
        for (User u : entryByHql) {
            System.out.println(u.getId());
        }
    }

    @Test
    public void insertUserService() {
        User user = new User();
        Survey s = new Survey();

        user.setEmail("474491418@qq.com");
        user.setName("zhangsan123");
        user.setNickName("rock2");
        user.setPassWord("123");
        user.setRegDate(new Date());
        s.setUser(user);
       us.saveEntry(user);
    //    surveyService.saveOrUpdateEntry(s);

    }
}
