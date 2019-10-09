package com.lizhuxiong.lizxspringbootmybatis.model;

public class errorDataNWithBLOBs extends errorDataN {
    private String errorData;

    private String ruleStr;

    private String disposeFeedback;

    private String originInfo;

    private String primaryData;

    public String getErrorData() {
        return errorData;
    }

    public void setErrorData(String errorData) {
        this.errorData = errorData == null ? null : errorData.trim();
    }

    public String getRuleStr() {
        return ruleStr;
    }

    public void setRuleStr(String ruleStr) {
        this.ruleStr = ruleStr == null ? null : ruleStr.trim();
    }

    public String getDisposeFeedback() {
        return disposeFeedback;
    }

    public void setDisposeFeedback(String disposeFeedback) {
        this.disposeFeedback = disposeFeedback == null ? null : disposeFeedback.trim();
    }

    public String getOriginInfo() {
        return originInfo;
    }

    public void setOriginInfo(String originInfo) {
        this.originInfo = originInfo == null ? null : originInfo.trim();
    }

    public String getPrimaryData() {
        return primaryData;
    }

    public void setPrimaryData(String primaryData) {
        this.primaryData = primaryData == null ? null : primaryData.trim();
    }
}