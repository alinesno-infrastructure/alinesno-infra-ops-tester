package com.alinesno.infra.ops.tester.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("parameter")
@TableComment("接口参数管理")
public class ParameterEntity extends InfraBaseEntity {

    @TableField("api_id")
    private Long apiId; // 接口ID

    @TableField("name")
    private String name; // 参数名称

    @TableField("value")
    private String value; // 参数值

    @TableField("type")
    private String type; // 参数类型

}