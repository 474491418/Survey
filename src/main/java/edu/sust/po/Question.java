package edu.sust.po;

/**
 * Created by envy15 on 2015/4/7 0007.
 */

/**
 * 问题类
 */
public class Question {
    private Integer id;
    //题型0-8
    private int questionType;
    private String title;
    //选项
    private String options;


    //其他项
    private boolean other;
    //其他样式 0-无 1-文本框 2-下拉列表
    private int otherType;

    //其他项下拉选项
    private String otherSelectOptions;
    //矩阵式行标集
    private String matrixRowTitles;
    //矩阵式列表标集
    private String matrixColTitles;
    //矩阵式下拉选项集
    private String matrixSelectOptions;

    private Page page;

    public Question() {
    }

    public Question(Integer id, int questionType, String title, String options, boolean other, int otherType, String otherSelectOptions, String matrixRowTitles, String matrixColTitles, String matrixSelectOptions, Page page) {
        this.id = id;
        this.questionType = questionType;
        this.title = title;
        this.options = options;
        this.other = other;
        this.otherType = otherType;
        this.otherSelectOptions = otherSelectOptions;
        this.matrixRowTitles = matrixRowTitles;
        this.matrixColTitles = matrixColTitles;
        this.matrixSelectOptions = matrixSelectOptions;
        this.page = page;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuestionType() {
        return questionType;
    }

    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }


    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public int getOtherType() {
        return otherType;
    }

    public void setOtherType(int otherType) {
        this.otherType = otherType;
    }

    public String getOtherSelectOptions() {
        return otherSelectOptions;
    }

    public void setOtherSelectOptions(String otherSelectOptions) {
        this.otherSelectOptions = otherSelectOptions;
    }

    public String getMatrixRowTitles() {
        return matrixRowTitles;
    }

    public void setMatrixRowTitles(String matrixRowTitles) {
        this.matrixRowTitles = matrixRowTitles;
    }

    public String getMatrixColTitles() {
        return matrixColTitles;
    }

    public void setMatrixColTitles(String matrixColTitles) {
        this.matrixColTitles = matrixColTitles;
    }

    public String getMatrixSelectOptions() {
        return matrixSelectOptions;
    }

    public void setMatrixSelectOptions(String matrixSelectOptions) {
        this.matrixSelectOptions = matrixSelectOptions;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
