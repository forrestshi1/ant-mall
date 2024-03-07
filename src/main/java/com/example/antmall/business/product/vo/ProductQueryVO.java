//BO要对外进行暴露
package com.example.antmall.business.product.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ProductQueryVO {
    @ApiModelProperty( "商品id")
    private long id;

    @ApiModelProperty( "商品名字")
    private String name;

    @ApiModelProperty( "商品描述")
    private String description;

    @ApiModelProperty( "商品单价")
    private BigDecimal unitPrice;

    @ApiModelProperty( "商品数量")
    private Integer stockQuantity;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;

}
