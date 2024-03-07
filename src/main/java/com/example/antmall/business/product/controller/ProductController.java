package com.example.antmall.business.product.controller;

import com.example.antmall.business.product.bo.ProductAddBO;
import com.example.antmall.business.product.bo.ProductEditBO;
import com.example.antmall.business.product.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "商品管理")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @ApiOperation("添加")
    @PostMapping("add")
    public void add(@RequestBody ProductAddBO addBO) {
        productService.add(addBO);
    }

    @ApiOperation("修改")
    @PostMapping("edit")
    public void edit(@RequestBody ProductEditBO editBO) {
        productService.edit( editBO);
    }

}
