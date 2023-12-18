package com.alinesno.infra.base.email.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 用户-邮件关系实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("user_email")
@Data
public class UserEmailEntity extends InfraBaseEntity {
    /**
     * 关系唯一标识符
     */
	@ColumnType(length=10)
	@ColumnComment("关系唯一标识符")
	@TableField("id")
    private Long id;

    /**
     * 用户的id
     */
    @TableField("user_id")
	@ColumnType(length=50)
	@ColumnComment("用户的id")
    private Long userId;

    /**
     * 邮件的id
     */
    @TableField("email_id")
	@ColumnType(length=255)
	@ColumnComment("邮件的id")
    private Long emailId;

    /**
     * 关系类型（如发件人、收件人、抄送人等）
     */
	@ColumnType(length=255)
	@ColumnComment("关系类型")
	@TableField("type")
    private String type;
}
