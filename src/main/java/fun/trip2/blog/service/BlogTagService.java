package fun.trip2.blog.service;

import fun.trip2.blog.entity.BlogTag;
import java.util.List;

/**
 * (BlogTag)表服务接口
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public interface BlogTagService {

    /**
     * 通过ID查询单条数据
     *
     * @param tagId 主键
     * @return 实例对象
     */
    BlogTag queryById(Long tagId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BlogTag> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param blogTag 实例对象
     * @return 实例对象
     */
    BlogTag insert(BlogTag blogTag);

    /**
     * 修改数据
     *
     * @param blogTag 实例对象
     * @return 实例对象
     */
    BlogTag update(BlogTag blogTag);

    /**
     * 通过主键删除数据
     *
     * @param tagId 主键
     * @return 是否成功
     */
    boolean deleteById(Long tagId);

}