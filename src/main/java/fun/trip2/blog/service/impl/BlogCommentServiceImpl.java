package fun.trip2.blog.service.impl;

import fun.trip2.blog.entity.BlogComment;
import fun.trip2.blog.dao.BlogCommentDao;
import fun.trip2.blog.service.BlogCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BlogComment)表服务实现类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
@Service("blogCommentService")
public class BlogCommentServiceImpl implements BlogCommentService {
    @Resource
    private BlogCommentDao blogCommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    @Override
    public BlogComment queryById(Long cId) {
        return this.blogCommentDao.queryById(cId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BlogComment> queryAllByLimit(int offset, int limit) {
        return this.blogCommentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param blogComment 实例对象
     * @return 实例对象
     */
    @Override
    public BlogComment insert(BlogComment blogComment) {
        this.blogCommentDao.insert(blogComment);
        return blogComment;
    }

    /**
     * 修改数据
     *
     * @param blogComment 实例对象
     * @return 实例对象
     */
    @Override
    public BlogComment update(BlogComment blogComment) {
        this.blogCommentDao.update(blogComment);
        return this.queryById(blogComment.getCId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long cId) {
        return this.blogCommentDao.deleteById(cId) > 0;
    }
}