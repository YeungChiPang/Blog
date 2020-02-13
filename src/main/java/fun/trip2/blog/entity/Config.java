package fun.trip2.blog.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

/**
 * (Config)实体类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public class Config implements Serializable {
    private static final long serialVersionUID = -17461153721922116L;
               
    private String configType;
            
               
    private String configName;
            
               
    private String configValue;
            
               
    private String configDesc;
            
               
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;
            
               
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date amendDate;
            


    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public String getConfigDesc() {
        return configDesc;
    }

    public void setConfigDesc(String configDesc) {
        this.configDesc = configDesc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getAmendDate() {
        return amendDate;
    }

    public void setAmendDate(Date amendDate) {
        this.amendDate = amendDate;
    }

}