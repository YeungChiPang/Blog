package fun.trip2.blog.service;

import fun.trip2.blog.entity.BlogTagRelationship;
import java.util.List;

/**
 * (BlogTagRelationship)表服务接口
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public interface BlogTagRelationshipService {

    /**
     * 通过ID查询单条数据
     *
     * @param rId 主键
     * @return 实例对象
     */
    BlogTagRelationship queryById(Long rId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BlogTagRelationship> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param blogTagRelationship 实例对象
     * @return 实例对象
     */
    BlogTagRelationship insert(BlogTagRelationship blogTagRelationship);

    /**
     * 修改数据
     *
     * @param blogTagRelationship 实例对象
     * @return 实例对象
     */
    BlogTagRelationship update(BlogTagRelationship blogTagRelationship);

    /**
     * 通过主键删除数据
     *
     * @param rId 主键
     * @return 是否成功
     */
    boolean deleteById(Long rId);

}