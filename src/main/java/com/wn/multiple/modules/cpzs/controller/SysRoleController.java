package com.wn.multiple.modules.cpzs.controller;

import com.wn.multiple.framework.base.BaseController;
import com.wn.multiple.modules.cpzs.model.SysRole;
import com.wn.multiple.modules.cpzs.service.ISysRoleService;
import com.wn.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cpzs/role")
public class SysRoleController extends BaseController {

    @Autowired
    private ISysRoleService sysRoleService;

    @PostMapping("/list")
    public R list() {
        List<SysRole> result = sysRoleService.selectList(null);
        return R.ok().put("data", result);
    }
}
