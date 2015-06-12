package edu.sust.service.Impl;

import edu.sust.dao.Interface.BaseDao;
import edu.sust.service.Interface.BaseService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by envy15 on 2015/4/8 0008.
 */

/**
 * 抽象的BaseService专门用于继承
 */
public abstract class AbstractBaseService<T> implements BaseService<T> {

    private BaseDao<T> dao;




    //注入dao
    @Resource
    public void setDao(BaseDao<T> dao) {
        this.dao = dao;
    }

    public void saveEntry(T t) {
        dao.saveEntry(t);
    }


    public void saveOrUpdateEntry(T t) {
        dao.saveOrUpdateEntry(t);
    }


    public void updateEntry(T t) {
        dao.updateEntry(t);
    }


    public void deleteEntry(T t) {
        dao.deleteEntry(t);
    }


    public void batchEntryByHql(String HQL, Object... obj) {
        dao.batchEntryByHql(HQL, obj);
    }


    public T loadEntry(Integer id) {
        return dao.loadEntry(id);
    }


    public T getEntry(Integer id) {
        return dao.getEntry(id);
    }


    public List findEntryByHql(String HQL, Object... obj) {
        return dao.findEntryByHql(HQL, obj);
    }
}
