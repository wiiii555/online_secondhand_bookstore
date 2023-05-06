package com.books.service.impl;

import com.books.domain.OrderInfo;
import com.books.mapper.OrderInfoMapper;
import com.books.service.IOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderInfoServiceImpl implements IOrderInfoService {

    @Autowired
    private OrderInfoMapper mapper;

    @Override
    public OrderInfo selectOrderInfoByOrderId(Long orderId) {
        return mapper.selectOrderInfoByOrderId(orderId);
    }

    @Override
    public List<OrderInfo> selectOrderInfoList(OrderInfo orderInfo) {
        return mapper.selectOrderInfoList(orderInfo);
    }

    @Override
    public int insertOrderInfo(OrderInfo orderInfo) {
        return mapper.insertOrderInfo(orderInfo);
    }

    @Override
    public int updateOrderInfo(OrderInfo orderInfo) {
        return mapper.updateOrderInfo(orderInfo);
    }

    @Override
    public int deleteOrderInfoByOrderIds(Long[] orderIds) {
        return deleteOrderInfoByOrderIds(orderIds);
    }

    @Override
    public int deleteOrderInfoByOrderId(Long orderId) {
        return mapper.deleteOrderInfoByOrderId(orderId);
    }
}
