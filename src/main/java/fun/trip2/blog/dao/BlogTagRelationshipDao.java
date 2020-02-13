package fun.trip2.blog.dao;

import fun.trip2.blog.entity.BlogTagRelationship;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (BlogTagRelationship)表数据库访问层
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public interface BlogTagRelationshipDao {

    /**
     * 通过ID查询单条数据
     *
     * @param rId 主键
     * @return 实例对象
     */
    BlogTagRelationship queryById(Long rId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BlogTagRelationship> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param blogTagRelationship 实例对象
     * @return 对象列表
     */
    List<BlogTagRelationship> queryAll(BlogTagRelationship blogTagRelationship);

    /**
     * 新增数据
     *
     * @param blogTagRelationship 实例对象
     * @return 影响行数
     */
    int insert(BlogTagRelationship blogTagRelationship);

    /**
     * 修改数据
     *
     * @param blogTagRelationship 实例对象
     * @return 影响行数
     */
    int update(BlogTagRelationship blogTagRelationship);

    /**
     * 通过主键删除数据
     *
     * @param rId 主键
     * @return 影响行数
     */
    int deleteById(Long rId);

}