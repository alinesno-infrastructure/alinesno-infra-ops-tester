package com.alinesno.infra.base.email.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

/**
 * 文件夹实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("folder")
@Data
public class FolderEntity extends InfraBaseEntity {
    /**
     * 文件夹唯一标识符
     */
	@ColumnType(length=10)
	@ColumnComment("文件夹唯一标识符")
	@TableField("id")
    private Long id;

    /**
     * 文件夹所属用户的id
     */
    @TableField("user_id")
	@ColumnType(length=50)
	@ColumnComment("文件夹所属用户的id")
    private Long userId;

    /**
     * 文件夹名称
     */
	@ColumnType(length=255)
	@ColumnComment("文件夹名称")
	@TableField("name")
    private String name;

    /**
     * 父文件夹的id（顶级文件夹的父文件夹id为空）
     */
    @TableField("parent_folder_id")
	@ColumnType(length=20)
	@ColumnComment("父文件夹的id")
    private Long parentFolderId;

    /**
     * 文件夹创建的时间戳
     */
    @TableField("create_time")
	@ColumnType(length=19)
	@ColumnComment("文件夹创建的时间戳")
    private LocalDateTime createTime;
}
