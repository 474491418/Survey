package edu.sust.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * Created by envy15 on 2015/4/7 0007.
 */

/**
 * 调查类
 */
public class Survey {
    private Integer id;
    private String preText = "上一步";
    private String title = "未命名";
    private String nextText = "下一步";
    private String doneText = "完成";
    private String exitText = "退出";
    private Date createDate = new Date();
    Set<Page> pages = new HashSet<Page>();
    //多对一映射
    private User user;

    public Set<Page> getPages() {
        return pages;
    }

    public void setPages(Set<Page> pages) {
        this.pages = pages;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreText() {
        return preText;
    }

    public void setPreText(String preText) {
        this.preText = preText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNextText() {
        return nextText;
    }

    public void setNextText(String nextText) {
        this.nextText = nextText;
    }

    public String getDoneText() {
        return doneText;
    }

    public void setDoneText(String doneText) {
        this.doneText = doneText;
    }

    public String getExitText() {
        return exitText;
    }

    public void setExitText(String exitText) {
        this.exitText = exitText;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
