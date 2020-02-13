package fun.trip2.blog.service.impl;

import fun.trip2.blog.entity.BlogTagRelationship;
import fun.trip2.blog.dao.BlogTagRelationshipDao;
import fun.trip2.blog.service.BlogTagRelationshipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BlogTagRelationship)表服务实现类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
@Service("blogTagRelationshipService")
public class BlogTagRelationshipServiceImpl implements BlogTagRelationshipService {
    @Resource
    private BlogTagRelationshipDao blogTagRelationshipDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rId 主键
     * @return 实例对象
     */
    @Override
    public BlogTagRelationship queryById(Long rId) {
        return this.blogTagRelationshipDao.queryById(rId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BlogTagRelationship> queryAllByLimit(int offset, int limit) {
        return this.blogTagRelationshipDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param blogTagRelationship 实例对象
     * @return 实例对象
     */
    @Override
    public BlogTagRelationship insert(BlogTagRelationship blogTagRelationship) {
        this.blogTagRelationshipDao.insert(blogTagRelationship);
        return blogTagRelationship;
    }

    /**
     * 修改数据
     *
     * @param blogTagRelationship 实例对象
     * @return 实例对象
     */
    @Override
    public BlogTagRelationship update(BlogTagRelationship blogTagRelationship) {
        this.blogTagRelationshipDao.update(blogTagRelationship);
        return this.queryById(blogTagRelationship.getRId());
    }

    /**
     * 通过主键删除数据
     *
     * @param rId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long rId) {
        return this.blogTagRelationshipDao.deleteById(rId) > 0;
    }
}