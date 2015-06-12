package edu.sust.service.Interface;

import edu.sust.po.User;


/**
 * Created by envy15 on 2015/4/8 0008.
 */
public interface UserService extends BaseService<User> {
    public boolean isUserReg(String username);
}
