package com.cc.eldercare.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author resetchen
 * @since 2023-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 学校ID
     */
    private Integer schoolId;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 用户头像
     */
    private String avatarImage;

    /**
     * 电话
     */
    private String phone;

    /**
     * 年龄
     */
    private String age;

    /**
     * 用户状态
     */
    private Boolean userStatus;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 地址
     */
    private String address;

    /**
     * 性别
     */
    private String gender;

    /**
     * 登录令牌
     */
    private String token;

    /**
     * 是否删除
     */
    private Boolean deletedSwitch;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 上次登录时间
     */
    private Date lastlogin;


}
