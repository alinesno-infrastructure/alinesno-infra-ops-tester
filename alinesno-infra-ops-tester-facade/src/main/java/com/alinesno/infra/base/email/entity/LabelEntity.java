package com.alinesno.infra.base.email.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 标签实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("label")
@Data
public class LabelEntity extends InfraBaseEntity {
    /**
     * 标签唯一标识符
     */
	@ColumnType(length=255)
	@ColumnComment("标签唯一标识符")
	@TableField("id")
    private Long id;

    /**
     * 标签所属用户的id
     */
    @TableField("user_id")
	@ColumnType(length=50)
	@ColumnComment("标签所属用户的id")
    private Long userId;

    /**
     * 标签名称
     */
	@ColumnType(length=255)
	@ColumnComment("标签名称")
	@TableField("name")
    private String name;
}
