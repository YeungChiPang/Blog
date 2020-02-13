package fun.trip2.blog.service;

import fun.trip2.blog.entity.BlogCategory;
import java.util.List;

/**
 * (BlogCategory)表服务接口
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public interface BlogCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param catId 主键
     * @return 实例对象
     */
    BlogCategory queryById(Long catId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BlogCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param blogCategory 实例对象
     * @return 实例对象
     */
    BlogCategory insert(BlogCategory blogCategory);

    /**
     * 修改数据
     *
     * @param blogCategory 实例对象
     * @return 实例对象
     */
    BlogCategory update(BlogCategory blogCategory);

    /**
     * 通过主键删除数据
     *
     * @param catId 主键
     * @return 是否成功
     */
    boolean deleteById(Long catId);

}