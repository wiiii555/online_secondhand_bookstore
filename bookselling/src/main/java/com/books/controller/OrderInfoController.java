package com.books.controller;

import com.books.domain.OrderInfo;
import com.books.service.impl.OrderInfoServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderInfoController {
    @Autowired
    private OrderInfoServiceImpl service;

    /**
     * 查询订单信息列表
     */
    @ApiOperation("查询订单信息列表")
    @GetMapping("/list")
    public List<OrderInfo> list(OrderInfo orderInfo)
    {
        List<OrderInfo> list = service.selectOrderInfoList(orderInfo);
        return list;
    }

    /**
     * 获取订单信息详细信息
     */
    @ApiOperation("获取订单信息详细信息")
    @GetMapping(value = "/{orderId}")
    public OrderInfo getInfo(@PathVariable("orderId") Long orderId)
    {
        return service.selectOrderInfoByOrderId(orderId);
    }

    /**
     * 新增订单信息
     */
    @ApiOperation("新增订单信息")
    @PostMapping
    public int add(@RequestBody OrderInfo orderInfo)
    {
        return service.insertOrderInfo(orderInfo);
    }

    /**
     * 修改订单信息
     */
    @ApiOperation("修改订单信息")
    @PutMapping
    public int edit(@RequestBody OrderInfo orderInfo)
    {
        return service.updateOrderInfo(orderInfo);
    }

    /**
     * 删除订单信息
     */
    @ApiOperation("删除订单信息")
    @DeleteMapping("/{orderIds}")
    public int remove(@PathVariable Long[] orderIds)
    {
        return (service.deleteOrderInfoByOrderIds(orderIds));
    }
}
