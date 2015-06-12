package edu.sust.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by envy15 on 2015/4/7 0007.
 */
public class Page {
    private Integer id;
    private String title = "未命名";
    private String description;
    //从page到survey之间多对一关系
    private Survey survey;
    //从页面到问题是一对多关系
    private Set<Question> questions = new HashSet<Question>();

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
