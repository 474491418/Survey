package edu.sust.dao.Impl;

import edu.sust.dao.Interface.BaseDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by envy15 on 2015/4/7 0007.
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBaseDao<T> implements BaseDao<T> {
    //注入SessionFactory
    @Resource
    private SessionFactory factory;
    private Class<T> clazz;

    public AbstractBaseDao() {
        //在这里使用this，这个this其实是指向的子类，因为当前类是不存在的
        //通过子类的反射，得到泛型化超类
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class<T>) type.getActualTypeArguments()[0];
    }

    public void saveEntry(T t) {
        factory.getCurrentSession().save(t);
    }


    public void saveOrUpdateEntry(T t) {
        factory.getCurrentSession().saveOrUpdate(t);
    }


    public void updateEntry(T t) {
        factory.getCurrentSession().update(t);
    }


    public void deleteEntry(T t) {
        factory.getCurrentSession().delete(t);
    }

    /**
     * 按照hql批量更新
     *
     * @param HQL
     * @param obj
     */

    public void batchEntryByHql(String HQL, Object... obj) {
        Query query = factory.getCurrentSession().createQuery(HQL);
        for (int i = 0; i < obj.length; i++) {
            query.setParameter(i, obj[i]);
        }
    }


    public T loadEntry(Integer id) {
        //使用构造函数来反射得到当前的类型从而实现调取

        return (T) factory.getCurrentSession().load(clazz, id);
    }


    public T getEntry(Integer id) {
        return (T) factory.getCurrentSession().get(clazz, id);
    }


    public List findEntryByHql(String HQL, Object... obj) {
        Query query = factory.getCurrentSession().createQuery(HQL);
        for (int i = 0; i < obj.length; i++) {
            query.setParameter(i, obj[i]);
        }
        return query.list();
    }
}
