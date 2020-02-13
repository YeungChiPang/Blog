package fun.trip2.blog.service.impl;

import fun.trip2.blog.entity.Config;
import fun.trip2.blog.dao.ConfigDao;
import fun.trip2.blog.service.ConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Config)表服务实现类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
@Service("configService")
public class ConfigServiceImpl implements ConfigService {
    @Resource
    private ConfigDao configDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public Config queryById( ) {
        return this.configDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Config> queryAllByLimit(int offset, int limit) {
        return this.configDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param config 实例对象
     * @return 实例对象
     */
    @Override
    public Config insert(Config config) {
        this.configDao.insert(config);
        return config;
    }

    /**
     * 修改数据
     *
     * @param config 实例对象
     * @return 实例对象
     */
    @Override
    public Config update(Config config) {
        this.configDao.update(config);
        return this.queryById(config.get());
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.configDao.deleteById() > 0;
    }
}