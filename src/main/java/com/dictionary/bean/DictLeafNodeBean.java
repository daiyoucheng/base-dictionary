package com.dictionary.bean;

/**
 * Created by Administrator on 2017/3/30.
 */
public class DictLeafNodeBean extends BaseEntity {
    private String dictId;
    private String dictCode;
    private String parentId;
    private int isRoot;
    private String fullpath;
    private String dictEn;
    private String dictCn;

    public String getFullpath() {
        return fullpath;
    }

    public void setFullpath(String fullpath) {
        this.fullpath = fullpath;
    }

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(int isRoot) {
        this.isRoot = isRoot;
    }

    public String getDictEn() {
        return dictEn;
    }

    public void setDictEn(String dictEn) {
        this.dictEn = dictEn;
    }

    public String getDictCn() {
        return dictCn;
    }

    public void setDictCn(String dictCn) {
        this.dictCn = dictCn;
    }

    @Override
    public String toString() {
        return "DictLeafNodeBean{" +
                "dictId=" + dictId +
                ", dictCode='" + dictCode + '\'' +
                ", parentId=" + parentId +
                ", isRoot=" + isRoot +
                ", dictEn='" + dictEn + '\'' +
                ", dictCn='" + dictCn + '\'' +
                '}';
    }
}
