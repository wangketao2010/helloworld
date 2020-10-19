package com.yc.jenkins.helper.entity.po;

public class BrandClueAdvertise {
    private Long id;

    private String reportDt;

    private String memberBrandId;

    private String memberBrandName;

    private Integer clueNumB;

    private Integer clueNumA;

    private Integer dealNumB;

    private Integer dealNumA;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReportDt() {
        return reportDt;
    }

    public void setReportDt(String reportDt) {
        this.reportDt = reportDt == null ? null : reportDt.trim();
    }

    public String getMemberBrandId() {
        return memberBrandId;
    }

    public void setMemberBrandId(String memberBrandId) {
        this.memberBrandId = memberBrandId == null ? null : memberBrandId.trim();
    }

    public String getMemberBrandName() {
        return memberBrandName;
    }

    public void setMemberBrandName(String memberBrandName) {
        this.memberBrandName = memberBrandName == null ? null : memberBrandName.trim();
    }

    public Integer getClueNumB() {
        return clueNumB;
    }

    public void setClueNumB(Integer clueNumB) {
        this.clueNumB = clueNumB;
    }

    public Integer getClueNumA() {
        return clueNumA;
    }

    public void setClueNumA(Integer clueNumA) {
        this.clueNumA = clueNumA;
    }

    public Integer getDealNumB() {
        return dealNumB;
    }

    public void setDealNumB(Integer dealNumB) {
        this.dealNumB = dealNumB;
    }

    public Integer getDealNumA() {
        return dealNumA;
    }

    public void setDealNumA(Integer dealNumA) {
        this.dealNumA = dealNumA;
    }
}