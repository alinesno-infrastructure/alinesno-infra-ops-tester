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
@TableName("request_history")
@TableComment("接口请求历史")
public class RequestHistoryEntity extends InfraBaseEntity {

    @TableField("api_id")
    private Long apiId; // 接口ID

    @TableField("user_id")
    private Long userId; // 用户ID

    @TableField("request_time")
    private Date requestTime; // 请求时间

    @TableField("response_time")
    private Date responseTime; // 响应时间

    @TableField("response_code")
    private String responseCode; // 响应状态码

    @TableField("response_body")
    private String responseBody; // 响应体

}