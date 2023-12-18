package com.alinesno.infra.base.email.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 用户实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("user_info")
@Data
public class UserInfoEntity extends InfraBaseEntity {
    /**
     * 用户唯一标识符
     */
	@ColumnType(length=10)
	@ColumnComment("用户唯一标识符")
	@TableField("id")
    private Long id;

    /**
     * 用户姓名
     */
	@ColumnType(length=255)
	@ColumnComment("用户姓名")
	@TableField("name")
    private String name;

    /**
     * 用户邮箱地址
     */
	@ColumnType(length=255)
	@ColumnComment("用户邮箱地址")
	@TableField("email")
    private String email;

    /**
     * 用户登录密码
     */
	@ColumnType(length=255)
	@ColumnComment("用户登录密码")
	@TableField("password")
    private String password;

    /**
     * 其他用户信息（如职位、部门等）
     */
    @TableField("other_info")
	@ColumnType(length=255)
	@ColumnComment("其他用户信息（如职位、部门等）")
    private String otherInfo;
}
