package fun.trip2.blog.service.impl;

import fun.trip2.blog.entity.LinkForword;
import fun.trip2.blog.dao.LinkForwordDao;
import fun.trip2.blog.service.LinkForwordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LinkForword)表服务实现类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
@Service("linkForwordService")
public class LinkForwordServiceImpl implements LinkForwordService {
    @Resource
    private LinkForwordDao linkForwordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param linkId 主键
     * @return 实例对象
     */
    @Override
    public LinkForword queryById(Long linkId) {
        return this.linkForwordDao.queryById(linkId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<LinkForword> queryAllByLimit(int offset, int limit) {
        return this.linkForwordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param linkForword 实例对象
     * @return 实例对象
     */
    @Override
    public LinkForword insert(LinkForword linkForword) {
        this.linkForwordDao.insert(linkForword);
        return linkForword;
    }

    /**
     * 修改数据
     *
     * @param linkForword 实例对象
     * @return 实例对象
     */
    @Override
    public LinkForword update(LinkForword linkForword) {
        this.linkForwordDao.update(linkForword);
        return this.queryById(linkForword.getLinkId());
    }

    /**
     * 通过主键删除数据
     *
     * @param linkId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long linkId) {
        return this.linkForwordDao.deleteById(linkId) > 0;
    }
}