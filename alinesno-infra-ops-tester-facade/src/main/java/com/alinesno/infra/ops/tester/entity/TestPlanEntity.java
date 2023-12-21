package com.alinesno.infra.ops.tester.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("test_plan")
@TableComment("测试计划管理")
public class TestPlanEntity extends InfraBaseEntity {

    @TableField("name")
    private String name; // 计划名称

    @TableField("api_id")
    private Long apiId; // 接口ID

    @TableField("test_case")
    private String testCase; // 测试用例

    @TableField("execution_time")
    private Date executionTime; // 执行时间

}