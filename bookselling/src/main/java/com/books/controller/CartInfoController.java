package com.books.controller;


import com.books.domain.CartInfo;
import com.books.service.impl.CartInfoServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cart")
public class CartInfoController {
    @Autowired
    private CartInfoServiceImpl service;

    /**
     * 查询购物车信息列表
     */
    @ApiOperation("查询购物车信息列表")
    @GetMapping("/list")
    public List<CartInfo> list(CartInfo cartInfo)
    {
        List<CartInfo> list = service.selectCartInfoList(cartInfo);
        return list;
    }

    /**
     * 获取购物车信息详细信息
     */
    @ApiOperation("获取购物车信息详细信息")
    @GetMapping(value = "/{cartId}")
    public CartInfo getInfo(@PathVariable("cartId") Long cartId)
    {
        return service.selectCartInfoByCartId(cartId);
    }

    /**
     * 新增购物车信息
     */
    @ApiOperation("新增购物车信息")
    @PostMapping
    public int add(@RequestBody CartInfo cartInfo)
    {
        return service.insertCartInfo(cartInfo);
    }

    /**
     * 修改购物车信息
     */
    @ApiOperation("修改购物车信息")
    @PutMapping
    public int edit(@RequestBody CartInfo cartInfo)
    {
        return service.updatePdCartNum(cartInfo);
    }

    /**
     * 删除购物车信息
     */
    @ApiOperation("删除购物车信息")
    @DeleteMapping("/{cartIds}")
    public int remove(@PathVariable Long[] cartIds)
    {
        return (service.deleteCartInfoByCartIds(cartIds));
    }
}
