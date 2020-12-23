package com.fxb.mvc.dao;

import com.fxb.mvc.entity.SysUserEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @author fengxianbin
 * @description: 用户dao层
 * @create 2020-12-22 9:42
 */
@Repository
public class SysUserDao {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    public SysUserEntity getSysUserEntity(String id) {
        return (SysUserEntity) sessionFactory.getCurrentSession().get(SysUserEntity.class,id);
    }

    public void save(SysUserEntity user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
