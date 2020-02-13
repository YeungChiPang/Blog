package fun.trip2.blog.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

/**
 * (Blog)实体类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public class Blog implements Serializable {
    private static final long serialVersionUID = 973418103727307765L;
    /**
    * 博客id
    */           
    private Long blogId;
            
    /**
    * 博客标题
    */           
    private String blogTitle;
            
    /**
    * 博客自定义路径url
    */           
    private String blogSubUrl;
            
    /**
    * 博客封面图
    */           
    private String blogCoverImage;
            
    /**
    * 博客内容
    */           
    private String blogContent;
            
    /**
    * 博客分类id
    */           
    private Long blogCatId;
            
    /**
    * 博客分类
    */           
    private String blogCategoryName;
            
    /**
    * 博客标签
    */           
    private String blogTags;
            
    /**
    * P-草稿 C-完成发布
    */           
    private String blogStatus;
            
    /**
    * 阅读量
    */           
    private long blogViews;
            
    /**
    * Y-允许评论 N-不允许评论
    */           
    private String enableComment;
            
    /**
    * 逻辑删除标记N-未删除Y-已删除
    */           
    private String deleteFlag;
            
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
            


    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogSubUrl() {
        return blogSubUrl;
    }

    public void setBlogSubUrl(String blogSubUrl) {
        this.blogSubUrl = blogSubUrl;
    }

    public String getBlogCoverImage() {
        return blogCoverImage;
    }

    public void setBlogCoverImage(String blogCoverImage) {
        this.blogCoverImage = blogCoverImage;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public Long getBlogCatId() {
        return blogCatId;
    }

    public void setBlogCatId(Long blogCatId) {
        this.blogCatId = blogCatId;
    }

    public String getBlogCategoryName() {
        return blogCategoryName;
    }

    public void setBlogCategoryName(String blogCategoryName) {
        this.blogCategoryName = blogCategoryName;
    }

    public String getBlogTags() {
        return blogTags;
    }

    public void setBlogTags(String blogTags) {
        this.blogTags = blogTags;
    }

    public String getBlogStatus() {
        return blogStatus;
    }

    public void setBlogStatus(String blogStatus) {
        this.blogStatus = blogStatus;
    }

    public long getBlogViews() {
        return blogViews;
    }

    public void setBlogViews(long blogViews) {
        this.blogViews = blogViews;
    }

    public String getEnableComment() {
        return enableComment;
    }

    public void setEnableComment(String enableComment) {
        this.enableComment = enableComment;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
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