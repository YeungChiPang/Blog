package fun.trip2.blog.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

/**
 * (BlogComment)实体类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public class BlogComment implements Serializable {
    private static final long serialVersionUID = 872373325333996935L;
    /**
    * 评论ID
    */           
    private Long cId;
            
    /**
    * 关联blogID
    */           
    private Long blogId;
            
    /**
    * 评论者名称
    */           
    private String cName;
            
    /**
    * 评论者email
    */           
    private String cEmail;
            
    /**
    * 评论者网站
    */           
    private String cWebsite;
            
    /**
    * 评论内容
    */           
    private String cContent;
            
    /**
    * 评论者来源ip
    */           
    private String cIp;
            
    /**
    * 评论提交时间
    */           
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cCreateDate;
            
    /**
    * 评论是否过审-未过N-已过Y
    */           
    private String cStatus;
            
    /**
    * 是否为回复评论
    */           
    private String replyFlag;
            
    /**
    * 回复对应频评论ID
    */           
    private Long replyCId;
            
    /**
    * 逻辑删除标记N-未删除Y-已删除
    */           
    private String deleteFlag;
            


    public Long getCId() {
        return cId;
    }

    public void setCId(Long cId) {
        this.cId = cId;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getCEmail() {
        return cEmail;
    }

    public void setCEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getCWebsite() {
        return cWebsite;
    }

    public void setCWebsite(String cWebsite) {
        this.cWebsite = cWebsite;
    }

    public String getCContent() {
        return cContent;
    }

    public void setCContent(String cContent) {
        this.cContent = cContent;
    }

    public String getCIp() {
        return cIp;
    }

    public void setCIp(String cIp) {
        this.cIp = cIp;
    }

    public Date getCCreateDate() {
        return cCreateDate;
    }

    public void setCCreateDate(Date cCreateDate) {
        this.cCreateDate = cCreateDate;
    }

    public String getCStatus() {
        return cStatus;
    }

    public void setCStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public String getReplyFlag() {
        return replyFlag;
    }

    public void setReplyFlag(String replyFlag) {
        this.replyFlag = replyFlag;
    }

    public Long getReplyCId() {
        return replyCId;
    }

    public void setReplyCId(Long replyCId) {
        this.replyCId = replyCId;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

}