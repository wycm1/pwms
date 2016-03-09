package com.pwms.pojo;

import java.util.ArrayList;
import java.util.List;

public class Articletype {
    private Integer id;

    private String value;

    private Integer pid;

    private String linkname;
    
    private List<NoticeTheroyContruction> articles = new ArrayList<NoticeTheroyContruction>();
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

	public List<NoticeTheroyContruction> getArticles() {
		return articles;
	}

	public void setArticles(List<NoticeTheroyContruction> articles) {
		this.articles = articles;
	}

    
}