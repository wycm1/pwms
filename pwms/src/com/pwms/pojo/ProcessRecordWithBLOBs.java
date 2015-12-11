package com.pwms.pojo;

public class ProcessRecordWithBLOBs extends ProcessRecord {
    private String explain;

    private String feeling;

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling == null ? null : feeling.trim();
    }
}