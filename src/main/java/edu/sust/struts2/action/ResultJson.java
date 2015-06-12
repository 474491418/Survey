package edu.sust.struts2.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by envy15 on 2015/4/13 0013.
 */
public class ResultJson implements Result {
    @Override
    public void execute(ActionInvocation actionInvocation) throws Exception {
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("utf-8");//处理中文乱码问题
        String message = ActionContext.getContext().getValueStack().peek().toString();//得到栈顶元素
        response.getWriter().print(message);//将得到的栈顶元素返回到客户端
    }
}
