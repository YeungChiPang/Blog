package fun.trip2.blog.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

/**
 * (BlogTagRelationship)实体类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public class BlogTagRelationship implements Serializable {
    private static final long serialVersionUID = 614636683692905494L;
    /**
    * 关系id
    */           
    private Long rId;
            
    /**
    * 标签id
    */           
    private Long tagId;
            
    /**
    * 博客实体id
    */           
    private Long blogId;
            
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
            


    public Long getRId() {
        return rId;
    }

    public void setRId(Long rId) {
        this.rId = rId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
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