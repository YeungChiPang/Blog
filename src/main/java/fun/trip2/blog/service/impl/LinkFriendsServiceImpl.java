package fun.trip2.blog.service.impl;

import fun.trip2.blog.entity.LinkFriends;
import fun.trip2.blog.dao.LinkFriendsDao;
import fun.trip2.blog.service.LinkFriendsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LinkFriends)表服务实现类
 *
 * @author Yuenggpong
 * @since 2020-02-11 09:26:57
 */
@Service("linkFriendsService")
public class LinkFriendsServiceImpl implements LinkFriendsService {
    @Resource
    private LinkFriendsDao linkFriendsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param linkId 主键
     * @return 实例对象
     */
    @Override
    public LinkFriends queryById(Long linkId) {
        return this.linkFriendsDao.queryById(linkId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<LinkFriends> queryAllByLimit(int offset, int limit) {
        return this.linkFriendsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param linkFriends 实例对象
     * @return 实例对象
     */
    @Override
    public LinkFriends insert(LinkFriends linkFriends) {
        this.linkFriendsDao.insert(linkFriends);
        return linkFriends;
    }

    /**
     * 修改数据
     *
     * @param linkFriends 实例对象
     * @return 实例对象
     */
    @Override
    public LinkFriends update(LinkFriends linkFriends) {
        this.linkFriendsDao.update(linkFriends);
        return this.queryById(linkFriends.getLinkId());
    }

    /**
     * 通过主键删除数据
     *
     * @param linkId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long linkId) {
        return this.linkFriendsDao.deleteById(linkId) > 0;
    }
}