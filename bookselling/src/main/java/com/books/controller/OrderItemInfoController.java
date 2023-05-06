package com.books.controller;

import com.books.domain.OrderItemInfo;
import com.books.service.impl.OrderItemInfoServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class OrderItemInfoController {
    @Autowired
    private OrderItemInfoServiceImpl service;

    /**
     * 查询订单信息列表
     */
    @ApiOperation("查询订单信息列表")
    @GetMapping("/list")
    public List<OrderItemInfo> list(OrderItemInfo orderItemInfo)
    {
        List<OrderItemInfo> list = service.selectOrderItemInfoList(orderItemInfo);
        return list;
    }

    /**
     * 获取订单信息详细信息
     */
    @ApiOperation("获取订单信息详细信息")
    @GetMapping(value = "/{itemId}")
    public OrderItemInfo getInfo(@PathVariable("itemId") Long itemId)
    {
        return service.selectOrderItemInfoByItemId(itemId);
    }

    /**
     * 新增订单信息
     */
    @ApiOperation("新增订单信息")
    @PostMapping
    public int add(@RequestBody OrderItemInfo orderItemInfo)
    {
        return service.insertOrderItemInfo(orderItemInfo);
    }

    /**
     * 修改订单信息
     */
    @ApiOperation("修改订单信息")
    @PutMapping
    public int edit(@RequestBody OrderItemInfo orderItemInfo)
    {
        return service.updateOrderItemInfo(orderItemInfo);
    }

    /**
     * 删除订单信息
     */
    @ApiOperation("删除订单信息")
    @DeleteMapping("/{itemIds}")
    public int remove(@PathVariable Long[] itemIds)
    {
        return (service.deleteOrderItemInfoByItemIds(itemIds));
    }
}
