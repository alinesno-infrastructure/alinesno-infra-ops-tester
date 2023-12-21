package com.alinesno.infra.ops.tester.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("api_version")
@TableComment("接口版本管理")
public class ApiVersionEntity extends InfraBaseEntity {

    @TableField("api_id")
    private Long apiId; // 接口ID

    @TableField("version_number")
    private String versionNumber; // 版本号

}