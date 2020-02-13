package fun.trip2.blog.service;

import fun.trip2.blog.entity.BlogComment;
import java.util.List;

/**
 * (BlogComment)表服务接口
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public interface BlogCommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    BlogComment queryById(Long cId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BlogComment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param blogComment 实例对象
     * @return 实例对象
     */
    BlogComment insert(BlogComment blogComment);

    /**
     * 修改数据
     *
     * @param blogComment 实例对象
     * @return 实例对象
     */
    BlogComment update(BlogComment blogComment);

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 是否成功
     */
    boolean deleteById(Long cId);

}