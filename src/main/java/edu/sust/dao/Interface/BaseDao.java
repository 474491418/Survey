package edu.sust.dao.Interface;

import java.util.List;

/**
 * Created by envy15 on 2015/4/7 0007.
 */
public interface BaseDao<T> {
    //写操作
    public void saveEntry(T t);

    public void saveOrUpdateEntry(T t);

    public void updateEntry(T t);

    public void deleteEntry(T t);

    //用hql批处理
    public void batchEntryByHql(String HQL, Object... obj);

    //读操作
    public T loadEntry(Integer id);

    public T getEntry(Integer id);

    public List<T> findEntryByHql(String HQL, Object... obj);

}
