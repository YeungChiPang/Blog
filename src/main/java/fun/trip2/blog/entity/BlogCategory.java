package fun.trip2.blog.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

/**
 * (BlogCategory)实体类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public class BlogCategory implements Serializable {
    private static final long serialVersionUID = 375287782897470073L;
    /**
    * 类别id
    */           
    private Long catId;
            
    /**
    * 类别名称
    */           
    private String catName;
            
    /**
    * 类别描述
    */           
    private String catDesc;
            
    /**
    * 类别图标
    */           
    private String catIcon;
            
    /**
    * 创建时间
    */           
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;
            
    /**
    * 逻辑删除标记N-未删除Y-已删除
    */           
    private String deleteFlag;
            
    /**
    * 优先级 1-5
    */           
    private String priority;
            


    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public String getCatIcon() {
        return catIcon;
    }

    public void setCatIcon(String catIcon) {
        this.catIcon = catIcon;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

}