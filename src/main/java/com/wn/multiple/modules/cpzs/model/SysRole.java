package com.wn.multiple.modules.cpzs.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.wn.multiple.framework.base.BaseModel;
import lombok.Data;

@TableName("sys_role")
@Data
public class SysRole extends BaseModel {

    //角色代码
    private String roleCode;
    //角色名称
    private String roleName;
}
