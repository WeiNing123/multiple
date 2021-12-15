package com.wn.multiple.modules.common.service.impl;

import com.wn.multiple.modules.common.service.ICommonService;
import com.wn.multiple.modules.cpzs.mapper.SysRoleMapper;
import com.wn.multiple.modules.cpzs.model.SysRole;
import com.wn.multiple.modules.sjzy.mapper.ApplicationSceneMapper;
import com.wn.multiple.modules.sjzy.mapper.RoleBakMapper;
import com.wn.multiple.modules.sjzy.model.RoleBak;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommonServiceImpl implements ICommonService {

    @Resource
    private SysRoleMapper sysRoleMapper;
    @Resource
    private ApplicationSceneMapper applicationSceneMapper;
    @Resource
    private RoleBakMapper roleBakMapper;

    @Override
    public void total() {
        sysRoleMapper.selectList(null).stream().forEach(item -> System.out.println(item));
        applicationSceneMapper.selectList(null).stream().forEach(item -> System.out.println(item));
    }

    @Override
    public void role() {
        List<SysRole> roles = sysRoleMapper.selectList(null);
        for (SysRole role : roles) {
            RoleBak bak = new RoleBak();
            bak.setId(role.getId());
            bak.setRoleCode(role.getRoleCode());
            bak.setRoleName(role.getRoleName());
            roleBakMapper.insert(bak);
        }
    }
}
