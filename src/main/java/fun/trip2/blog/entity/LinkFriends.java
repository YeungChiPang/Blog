package fun.trip2.blog.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

/**
 * (LinkFriends)实体类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public class LinkFriends implements Serializable {
    private static final long serialVersionUID = 576023669744602584L;
    /**
    * 博客友情链接id
    */           
    private Long linkId;
            
    /**
    * 友情链接名称
    */           
    private String linkName;
            
    /**
    * 友情链接url
    */           
    private String url;
            
    /**
    * 链接类型
    */           
    private String linkType;
            
    /**
    * 链接描述
    */           
    private String linkDesc;
            
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
            
    /**
    * 优先级 1-5
    */           
    private String priority;
            


    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getLinkDesc() {
        return linkDesc;
    }

    public void setLinkDesc(String linkDesc) {
        this.linkDesc = linkDesc;
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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

}