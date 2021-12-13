package com.wn.multiple.modules.sjzy.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.wn.multiple.framework.base.BaseModel;
import lombok.Data;

import java.util.Date;

@TableName("application_scene")
@Data
public class ApplicationScene extends BaseModel {

    //场景名称
    private String label;
    //创建人
    private String creator;
    //创建时间
    private Date createTime;
    //项目名称
    private String projectName;
    //场景简介
    private String remarks;
    //字段数量
    private Integer fieldCount;
    //记录数
    private Integer recordCount;
    //表数量
    private Integer tableCount;
    //表容量
    private String capacity;
}
