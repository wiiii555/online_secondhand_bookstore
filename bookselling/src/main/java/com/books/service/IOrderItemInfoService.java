package com.books.service;

import com.books.domain.OrderItemInfo;

import java.util.List;

public interface IOrderItemInfoService {
    /**
     * 查询订单项信息
     *
     * @param itemId 订单项信息主键
     * @return 订单项信息
     */
    public OrderItemInfo selectOrderItemInfoByItemId(Long itemId);

    /**
     * 查询订单项信息列表
     *
     * @param orderItemInfo 订单项信息
     * @return 订单项信息集合
     */
    public List<OrderItemInfo> selectOrderItemInfoList(OrderItemInfo orderItemInfo);

    /**
     * 新增订单项信息
     *
     * @param orderItemInfo 订单项信息
     * @return 结果
     */
    public int insertOrderItemInfo(OrderItemInfo orderItemInfo);

    /**
     * 修改订单项信息
     *
     * @param orderItemInfo 订单项信息
     * @return 结果
     */
    public int updateOrderItemInfo(OrderItemInfo orderItemInfo);

    /**
     * 批量删除订单项信息
     *
     * @param itemIds 需要删除的订单项信息主键集合
     * @return 结果
     */
    public int deleteOrderItemInfoByItemIds(Long[] itemIds);

    /**
     * 删除订单项信息信息
     *
     * @param itemId 订单项信息主键
     * @return 结果
     */
    public int deleteOrderItemInfoByItemId(Long itemId);

}
