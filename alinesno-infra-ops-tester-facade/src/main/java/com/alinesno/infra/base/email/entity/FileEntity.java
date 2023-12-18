package com.alinesno.infra.base.email.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 文件实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("file")
@Data
public class FileEntity extends InfraBaseEntity {
    /**
     * 文件唯一标识符
     */
	@ColumnType(length=10)
	@ColumnComment("文件唯一标识符")
	@TableField("id")
    private Long id;

    /**
     * 文件的名称
     */
    @TableField("file_name")
	@ColumnType(length=255)
	@ColumnComment("文件的名称")
    private String fileName;

    /**
     * 文件在服务器上的存储路径
     */
    @TableField("storage_path")
	@ColumnType(length=255)
	@ColumnComment("文件在服务器上的存储路径")
    private String storagePath;

    /**
     * 文件大小
     */
	@ColumnType(length=255)
	@ColumnComment("文件大小")
	@TableField("size")
    private Integer size;

    /**
     * 文件类型（如文档、图片、压缩文件等）
     */
	@ColumnType(length=255)
	@ColumnComment("文件类型")
	@TableField("type")
    private String type;
}
