package fun.trip2.blog.service;

import fun.trip2.blog.entity.Config;
import java.util.List;

/**
 * (Config)表服务接口
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
public interface ConfigService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Config queryById( );

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Config> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param config 实例对象
     * @return 实例对象
     */
    Config insert(Config config);

    /**
     * 修改数据
     *
     * @param config 实例对象
     * @return 实例对象
     */
    Config update(Config config);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}