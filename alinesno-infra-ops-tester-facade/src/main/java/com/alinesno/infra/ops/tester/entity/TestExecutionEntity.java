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
@TableName("test_execution")
@TableComment("测试执行情况管理")
public class TestExecutionEntity extends InfraBaseEntity {

    @TableField("test_plan_id")
    private Long testPlanId; // 测试计划ID

    @TableField("api_id")
    private Long apiId; // 接口ID

    @TableField("execution_time")
    private Date executionTime; // 执行时间

}