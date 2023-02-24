package com.cc.eldercare.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章
 * </p>
 *
 * @author resetchen
 * @since 2023-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 分类Id
     */
    @TableField("categoryId")
    private Integer categoryId;

    /**
     * 标题
     */
    private String title;

    /**
     * 封面图片
     */
    private String faceImage;

    /**
     * 内容
     */
    private String content;

    /**
     * 添加时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModified;

    /**
     * 关键字
     */
    @TableField("keyWord")
    private String keyWord;

    /**
     * 评论数
     */
    @TableField("commentNum")
    private Integer commentNum;

    /**
     * 阅读数
     */
    @TableField("viewNum")
    private Integer viewNum;

    /**
     * 状态
     */
    private Boolean articleStatus;

    /**
     * 是否置顶
     */
    @TableField("isTop")
    private Boolean isTop;


}
