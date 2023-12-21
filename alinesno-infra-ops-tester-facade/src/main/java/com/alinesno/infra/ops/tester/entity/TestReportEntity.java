package com.alinesno.infra.ops.tester.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("test_report")
@TableComment("测试报表管理")
public class TestReportEntity extends InfraBaseEntity {

    @TableField("api_id")
    private Long apiId; // 接口ID

    @TableField("user_id")
    private Long userId; // 用户ID

    @TableField("success_rate")
    private Double successRate; // 成功率

    @TableField("error_message")
    private String errorMessage; // 错误消息

}