//BO要对外进行暴露
package com.example.antmall.business.product.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data; // Lombok, 自动生成getter, setter, toString, equals, hashCode等方法

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class ProductAddBO {
    @NotBlank(message = "商品名字不能为空")
    @ApiModelProperty( "商品名字")
    private String name;

    @ApiModelProperty( "商品描述")
    private String description;

    @ApiModelProperty( "商品单价")
    private BigDecimal unitPrice;

    @ApiModelProperty( "商品数量")
    private Integer stockQuantity;
}
