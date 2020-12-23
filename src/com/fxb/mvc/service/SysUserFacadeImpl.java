package com.fxb.mvc.service;

import com.fxb.mvc.dao.SysUserDao;
import com.fxb.mvc.entity.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author fengxianbin
 * @description: 用户实现
 * @create 2020-12-22 9:44
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SysUserFacadeImpl implements  SysUserFacade{

    @Autowired
    private SysUserDao sysUserDao;


    @Override
    public SysUserEntity getSysUserEntity(String id) {
        return sysUserDao.getSysUserEntity(id);
    }

    @Override
    public void say() {
        System.out.println("1234567");
    }

    @Override
    public void save(SysUserEntity user) {
        sysUserDao.save(user);
    }

}
