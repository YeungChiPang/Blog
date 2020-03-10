package fun.trip2.blog.service.impl;

import fun.trip2.blog.dao.BlogCategoryDao;
import fun.trip2.blog.entity.BlogCategory;
import fun.trip2.blog.service.BlogCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BlogCategory)表服务实现类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
@Service("blogCategoryService")
public class BlogCategoryServiceImpl implements BlogCategoryService {
    @Resource
    private BlogCategoryDao blogCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param catId 主键
     * @return 实例对象
     */
    @Override
    public BlogCategory queryById(Long catId) {
        return this.blogCategoryDao.queryById(catId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BlogCategory> queryAllByLimit(int offset, int limit) {
        return this.blogCategoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param blogCategory 实例对象
     * @return 实例对象
     */
    @Override
    public BlogCategory insert(BlogCategory blogCategory) {
        this.blogCategoryDao.insert(blogCategory);
        return blogCategory;
    }

    /**
     * 修改数据
     *
     * @param blogCategory 实例对象
     * @return 实例对象
     */
    @Override
    public BlogCategory update(BlogCategory blogCategory) {
        this.blogCategoryDao.update(blogCategory);
        return this.queryById(blogCategory.getCatId());
    }

    /**
     * 通过主键删除数据
     *
     * @param catId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long catId) {
        return this.blogCategoryDao.deleteById(catId) > 0;
    }
}