package com.example.antmall.business.product.controller;

import com.example.antmall.business.product.bo.ProductAddBO;
import com.example.antmall.business.product.bo.ProductEditBO;
import com.example.antmall.business.product.bo.ProductQueryBO;
import com.example.antmall.business.product.service.ProductService;
import com.example.antmall.business.product.vo.ProductQueryVO;
import com.example.antmall.common.entity.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation("分页查询")
    @GetMapping("page")
    public PageVO<ProductQueryVO> page(@RequestBody ProductQueryBO queryBO) {
        return  productService.page(queryBO);
    }

}
