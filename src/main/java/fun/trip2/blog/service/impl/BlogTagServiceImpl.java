package fun.trip2.blog.service.impl;

import fun.trip2.blog.entity.BlogTag;
import fun.trip2.blog.dao.BlogTagDao;
import fun.trip2.blog.service.BlogTagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BlogTag)表服务实现类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
@Service("blogTagService")
public class BlogTagServiceImpl implements BlogTagService {
    @Resource
    private BlogTagDao blogTagDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tagId 主键
     * @return 实例对象
     */
    @Override
    public BlogTag queryById(Long tagId) {
        return this.blogTagDao.queryById(tagId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BlogTag> queryAllByLimit(int offset, int limit) {
        return this.blogTagDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param blogTag 实例对象
     * @return 实例对象
     */
    @Override
    public BlogTag insert(BlogTag blogTag) {
        this.blogTagDao.insert(blogTag);
        return blogTag;
    }

    /**
     * 修改数据
     *
     * @param blogTag 实例对象
     * @return 实例对象
     */
    @Override
    public BlogTag update(BlogTag blogTag) {
        this.blogTagDao.update(blogTag);
        return this.queryById(blogTag.getTagId());
    }

    /**
     * 通过主键删除数据
     *
     * @param tagId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long tagId) {
        return this.blogTagDao.deleteById(tagId) > 0;
    }
}