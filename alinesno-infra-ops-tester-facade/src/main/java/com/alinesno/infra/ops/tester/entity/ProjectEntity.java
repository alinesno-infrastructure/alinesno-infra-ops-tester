package com.alinesno.infra.ops.tester.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("project")
@TableComment("项目管理")
public class ProjectEntity extends InfraBaseEntity {

    @TableField("name")
    private String name; // 项目名称

    @TableField("icon")
    private String icon ; // 项目图标

}