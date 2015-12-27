package com.pwms.pojo;

import java.util.Date;

public class ImportDoc {
    private Integer id;

    private String filepath;

    private String title;

    private String summary;

    private Date dateline;

    private Integer userId;

    private String explain;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Date getDateline() {
        return dateline;
    }

    public void setDateline(Date dateline) {
        this.dateline = dateline;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }
    public String toString(){
    	String json ="{ \"id\" :"+id+","+
    			"\"filepath\" : \""+filepath+"\","+
    			"\"title\" : \""+title+"\","+
    			"\"summary\" : \""+summary+"\","+
    			"\"dateline\" : \""+dateline+"\","+
    			"\"userId\" : \""+dateline+"\","+
    			"\"explain\" : \""+explain+"\"";
    	return json;
    }
}