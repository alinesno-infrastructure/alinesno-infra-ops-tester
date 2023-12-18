package com.alinesno.infra.base.email.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 用户-文件夹关系实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("user_folder")
@Data
public class UserFolderEntity extends InfraBaseEntity {
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
    @TableField(value = "user_id")
	@ColumnType(length=50)
	@ColumnComment("用户的id")
    private Long userId;

    /**
     * 文件夹的id
     */
    @TableField(value = "folder_id")
	@ColumnType(length=50)
	@ColumnComment("文件夹的id")
    private Long folderId;
}
