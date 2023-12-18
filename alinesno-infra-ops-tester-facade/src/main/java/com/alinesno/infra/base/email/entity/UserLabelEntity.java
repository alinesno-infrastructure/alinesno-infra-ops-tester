package com.alinesno.infra.base.email.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 用户-标签关系实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("user_label")
@Data
public class UserLabelEntity extends InfraBaseEntity {
    /**
     * 关系唯一标识符
     */
	@ColumnType(length=255)
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
     * 标签的id
     */
    @TableField("label_id")
	@ColumnType(length=10)
	@ColumnComment("标签的id")
    private Long labelId;
}
