package com.wn.multiple.modules.common.service.impl;

import com.wn.multiple.modules.common.service.ICommonService;
import com.wn.multiple.modules.cpzs.mapper.SysRoleMapper;
import com.wn.multiple.modules.sjzy.mapper.ApplicationSceneMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommonServiceImpl implements ICommonService {

    @Resource
    private SysRoleMapper sysRoleMapper;
    @Resource
    private ApplicationSceneMapper applicationSceneMapper;

    @Override
    public void total() {
        sysRoleMapper.selectList(null).stream().forEach(item -> System.out.println(item));
        applicationSceneMapper.selectList(null).stream().forEach(item -> System.out.println(item));
    }
}
