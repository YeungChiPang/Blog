package fun.trip2.blog.service;

import fun.trip2.blog.entity.LinkForword;
import java.util.List;

/**
 * (LinkForword)表服务接口
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public interface LinkForwordService {

    /**
     * 通过ID查询单条数据
     *
     * @param linkId 主键
     * @return 实例对象
     */
    LinkForword queryById(Long linkId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LinkForword> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param linkForword 实例对象
     * @return 实例对象
     */
    LinkForword insert(LinkForword linkForword);

    /**
     * 修改数据
     *
     * @param linkForword 实例对象
     * @return 实例对象
     */
    LinkForword update(LinkForword linkForword);

    /**
     * 通过主键删除数据
     *
     * @param linkId 主键
     * @return 是否成功
     */
    boolean deleteById(Long linkId);

}