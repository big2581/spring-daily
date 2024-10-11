package com.big.study_spring.bean;

/**
 * 讲代理对象注入到当前对象 使用代理的方法
 *
 * @author Yin
 * @date 2024-10-08 14:44
 */
public class AbcBean {

    public void setXxxBean(XxxBean xxxBean) {
        this.xxxBean = xxxBean;
    }

    public XxxBean getXxxBean() {
        return xxxBean;
    }

    private XxxBean xxxBean;

}
