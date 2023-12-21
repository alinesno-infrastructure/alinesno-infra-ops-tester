package com.alinesno.infra.ops.tester.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("data")
@TableComment("接口数据管理")
public class DataEntity extends InfraBaseEntity {

    @TableField("api_id")
    private Long apiId; // 接口ID

    @TableField("name")
    private String name; // 数据名称

    @TableField("value")
    private String value; // 数据值

}