package fun.trip2.blog.dao;

import fun.trip2.blog.entity.BlogComment;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (BlogComment)表数据库访问层
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public interface BlogCommentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    BlogComment queryById(Long cId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BlogComment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param blogComment 实例对象
     * @return 对象列表
     */
    List<BlogComment> queryAll(BlogComment blogComment);

    /**
     * 新增数据
     *
     * @param blogComment 实例对象
     * @return 影响行数
     */
    int insert(BlogComment blogComment);

    /**
     * 修改数据
     *
     * @param blogComment 实例对象
     * @return 影响行数
     */
    int update(BlogComment blogComment);

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 影响行数
     */
    int deleteById(Long cId);

}