package com.alinesno.infra.ops.tester.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("api")
@TableComment("接口表")
public class ApiEntity extends InfraBaseEntity {

    @TableField("name")
    private String name; // 接口名称

    @TableField("url")
    private String url; // 接口URL

    @TableField("method")
    private String method; // 请求方法

    @TableField("category_id")
    private Long categoryId; // 接口分类ID

}