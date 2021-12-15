package com.wn.multiple.modules.sjzy.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.wn.multiple.framework.base.BaseModel;
import lombok.Data;

@TableName("sys_role_bak")
@Data
public class RoleBak extends BaseModel {

    //角色代码
    private String roleCode;
    //角色名称
    private String roleName;
}
