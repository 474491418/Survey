package edu.sust.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

/**
 * Created by envy15 on 2015/4/10 0010.
 */

/**
 * 抽象Action,专门用于继承
 * 约定action 以action结尾重定向到另一个action，以page结尾调到一个jsp
 *
 * @param <T>
 */
public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T>, Preparable {

    private static final long serialVersionUID = 3101541387672183558L;

    @Override
    public abstract T getModel();

    @Override
    public void prepare() throws Exception {

    }
}
