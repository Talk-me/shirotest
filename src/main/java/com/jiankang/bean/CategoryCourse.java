package com.jiankang.bean;

import java.io.Serializable;

public class CategoryCourse implements Serializable {

    private int categoryid;
    private String categoryname;


    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
