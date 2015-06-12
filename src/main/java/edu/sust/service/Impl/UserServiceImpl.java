package edu.sust.service.Impl;

import edu.sust.dao.Interface.BaseDao;
import edu.sust.po.User;
import edu.sust.service.Interface.UserService;
import edu.sust.util.DataUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by envy15 on 2015/4/8 0008.
 */
@Service("userService")
public class UserServiceImpl extends AbstractBaseService<User> implements UserService {
    //他会回调超类的setDao方法
    @Resource(name = "userDao")
    public void setDao(BaseDao<User> dao) {
        super.setDao(dao);
    }



    @Override
    public boolean isUserReg(String username) {
        String hql = "from User where user_name=?";
        List entryByHql = this.findEntryByHql(hql, username);
        System.out.println(username);

       boolean result = DataUtil.isListHasData(entryByHql);
        return result;
    }
}
