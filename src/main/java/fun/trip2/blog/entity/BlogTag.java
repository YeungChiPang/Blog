package fun.trip2.blog.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

/**
 * (BlogTag)实体类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public class BlogTag implements Serializable {
    private static final long serialVersionUID = 465698375712431206L;
    /**
    * 博客tag主键
    */           
    private Long tagId;
            
    /**
    * tag名
    */           
    private String tagName;
            
    /**
    * 创建时间
    */           
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;
            
    /**
    * 修改时间
    */           
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date amendDate;
            
    /**
    * 逻辑删除标记N-未删除Y-已删除
    */           
    private String deleteFlag;
            


    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
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

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

}