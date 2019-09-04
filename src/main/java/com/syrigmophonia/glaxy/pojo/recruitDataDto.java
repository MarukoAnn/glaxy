package com.syrigmophonia.glaxy.pojo;

public class recruitDataDto {
    private int id;
    private String duty;
    private String dutyName;
    private String treatment;
    private String iphone;
    private String describe;
    private String studytype;
    private int sid;

    public recruitDataDto(int id, String duty, String dutyName, String treatment, String iphone, String describe, String studytype, int sid) {
        this.id = id;
        this.duty = duty;
        this.dutyName = dutyName;
        this.treatment = treatment;
        this.iphone = iphone;
        this.describe = describe;
        this.studytype = studytype;
        this.sid = sid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getStudytype() {
        return studytype;
    }

    public void setStudytype(String studytype) {
        this.studytype = studytype;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
