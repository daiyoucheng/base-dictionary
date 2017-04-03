package com.dictionary.bean;

/**
 * Created by Administrator on 2017/4/3.
 */
public class DictNodeValueBean extends BaseEntity{
    private String dataId;
    private String dictId;
    private String dataValue;
    private String dataEn;
    private String dataCn;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getDataEn() {
        return dataEn;
    }

    public void setDataEn(String dataEn) {
        this.dataEn = dataEn;
    }

    public String getDataCn() {
        return dataCn;
    }

    public void setDataCn(String dataCn) {
        this.dataCn = dataCn;
    }

    @Override
    public String toString() {
        return "DictNodeValueBean{" +
                "dataId='" + dataId + '\'' +
                ", dictId='" + dictId + '\'' +
                ", dataValue='" + dataValue + '\'' +
                ", dataEn='" + dataEn + '\'' +
                ", dataCn='" + dataCn + '\'' +
                '}';
    }
}
