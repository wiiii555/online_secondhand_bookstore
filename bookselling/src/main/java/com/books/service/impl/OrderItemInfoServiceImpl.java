package com.books.service.impl;

import com.books.domain.OrderItemInfo;
import com.books.mapper.OrderItemInfoMapper;
import com.books.service.IOrderItemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemInfoServiceImpl implements IOrderItemInfoService {
    @Autowired
    OrderItemInfoMapper mapper;

    @Override
    public OrderItemInfo selectOrderItemInfoByItemId(Long itemId) {
        return mapper.selectOrderItemInfoByItemId(itemId);
    }

    @Override
    public List<OrderItemInfo> selectOrderItemInfoList(OrderItemInfo orderItemInfo) {
        return mapper.selectOrderItemInfoList(orderItemInfo);
    }

    @Override
    public int insertOrderItemInfo(OrderItemInfo orderItemInfo) {
        return mapper.insertOrderItemInfo(orderItemInfo);
    }

    @Override
    public int updateOrderItemInfo(OrderItemInfo orderItemInfo) {
        return mapper.updateOrderItemInfo(orderItemInfo);
    }

    @Override
    public int deleteOrderItemInfoByItemIds(Long[] itemIds) {
        return mapper.deleteOrderItemInfoByItemIds(itemIds);
    }

    @Override
    public int deleteOrderItemInfoByItemId(Long itemId) {
        return mapper.deleteOrderItemInfoByItemId(itemId);
    }
}
