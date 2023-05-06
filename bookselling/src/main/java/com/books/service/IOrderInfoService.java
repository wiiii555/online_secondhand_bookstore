package com.books.service;

import com.books.domain.OrderInfo;

import java.util.List;

public interface IOrderInfoService {
    /**
     * 查询订单信息
     *
     * @param orderId 订单信息主键
     * @return 订单信息
     */
    public OrderInfo selectOrderInfoByOrderId(Long orderId);

    /**
     * 查询订单信息列表
     *
     * @param orderInfo 订单信息
     * @return 订单信息集合
     */
    public List<OrderInfo> selectOrderInfoList(OrderInfo orderInfo);

    /**
     * 新增订单信息
     *
     * @param orderInfo 订单信息
     * @return 结果
     */
    public int insertOrderInfo(OrderInfo orderInfo);

    /**
     * 修改订单信息
     *
     * @param orderInfo 订单信息
     * @return 结果
     */
    public int updateOrderInfo(OrderInfo orderInfo);

    /**
     * 批量删除订单信息
     *
     * @param orderIds 需要删除的订单信息主键集合
     * @return 结果
     */
    public int deleteOrderInfoByOrderIds(Long[] orderIds);

    /**
     * 删除订单信息列表
     *
     * @param orderId 订单信息主键
     * @return 结果
     */
    public int deleteOrderInfoByOrderId(Long orderId);

}
