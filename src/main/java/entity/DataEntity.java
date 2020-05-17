package entity;

import java.util.HashMap;
import java.util.List;

/**
 * 数据实体类
 */
public class DataEntity {

    /**
     * 表名
     */
    String name;

    /**
     * 唯一标识
     */
    Integer id;

    /**
     * 主键列表
     */
    List primaryKeys;

    /**
     * 数据主体
     */
    HashMap<String,String> dataValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List getPrimaryKeys() {
        return primaryKeys;
    }

    public void setPrimaryKeys(List primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    public HashMap<String, String> getDataValue() {
        return dataValue;
    }

    public void setDataValue(HashMap<String, String> dataValue) {
        this.dataValue = dataValue;
    }

    public DataEntity() {
    }

    public DataEntity(String name, Integer id, List primaryKeys, HashMap<String, String> dataValue) {
        this.name = name;
        this.id = id;
        this.primaryKeys = primaryKeys;
        this.dataValue = dataValue;
    }

    @Override
    public String toString() {
        return "DataEntity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", primaryKeys=" + primaryKeys +
                ", dataValue=" + dataValue +
                '}';
    }
}
