package com.lizhuxiong.lizxspringbootmybatis.model;

import java.util.Date;

public class errorDataN {
    private String id;

    private String fieldLogId;

    private String fieldCol;

    private String fieldName;

    private String tableRealName;

    private String tableName;

    private Date createDate;

    private String tableHierarchy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFieldLogId() {
        return fieldLogId;
    }

    public void setFieldLogId(String fieldLogId) {
        this.fieldLogId = fieldLogId == null ? null : fieldLogId.trim();
    }

    public String getFieldCol() {
        return fieldCol;
    }

    public void setFieldCol(String fieldCol) {
        this.fieldCol = fieldCol == null ? null : fieldCol.trim();
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    public String getTableRealName() {
        return tableRealName;
    }

    public void setTableRealName(String tableRealName) {
        this.tableRealName = tableRealName == null ? null : tableRealName.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTableHierarchy() {
        return tableHierarchy;
    }

    public void setTableHierarchy(String tableHierarchy) {
        this.tableHierarchy = tableHierarchy == null ? null : tableHierarchy.trim();
    }
}