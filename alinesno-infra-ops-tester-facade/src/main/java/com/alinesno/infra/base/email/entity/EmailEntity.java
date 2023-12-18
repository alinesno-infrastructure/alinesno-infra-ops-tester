package com.alinesno.infra.base.email.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

/**
 * 邮件实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("email")
@Data
public class EmailEntity extends InfraBaseEntity {
    /**
     * 邮件唯一标识符
     */
	@ColumnType(length=10)
	@ColumnComment("邮件唯一标识符")
	@TableField("id")
    private Long id;

    /**
     * 邮件发送者的用户id
     */
    @TableField("sender_id")
	@ColumnType(length=50)
	@ColumnComment("邮件发送者的用户id")
    private Long senderId;

    /**
     * 邮件接收者的用户id（可以是多个）
     */
    @TableField("recipient_id")
	@ColumnType(length=50)
	@ColumnComment("邮件接收者的用户id（可以是多个）")
    private Long recipientId;

    /**
     * 邮件主题
     */
	@ColumnType(length=255)
	@ColumnComment("邮件主题")
	@TableField("subject")
    private String subject;

    /**
     * 邮件正文内容
     */
	@ColumnType(length=255)
	@ColumnComment("邮件正文内容")
	@TableField("content")
    private String content;

    /**
     * 邮件附件（可以是多个）
     */
	@ColumnType(length=255)
	@ColumnComment("邮件附件（可以是多个）")
	@TableField("attachments")
    private String attachments;

    /**
     * 邮件发送的时间戳
     */
    @TableField("send_time")
	@ColumnType(length=20)
	@ColumnComment("邮件发送的时间戳")
    private LocalDateTime sendTime;

    /**
     * 邮件状态（如已读、未读、已回复等）
     */
	@ColumnType(length=1)
	@ColumnComment("邮件状态（如已读、未读、已回复等）")
	@TableField("status")
    private String status;
}
