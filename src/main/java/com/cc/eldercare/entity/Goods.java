package com.cc.eldercare.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author resetchen
 * @since 2023-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId(value = "goods_id", type = IdType.AUTO)
    private Long goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 图片路径
     */
    private String goodsImg;

    /**
     * 商品价格
     */
    private String goodsPrice;

    /**
     * 商品/正文的标题
     */
    private String goodsTitle;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户名/昵称
     */
    private String userName;

    /**
     * 商品上架时间/创建时间
     */
    private Date gmtCreate;

    /**
     * 商品类别
     */
    private String goodsType;

    /**
     * 商品描述/正文内容
     */
    private String goodsDescription;

    /**
     * 联系方式
     */
    private String contactInformation;


}
