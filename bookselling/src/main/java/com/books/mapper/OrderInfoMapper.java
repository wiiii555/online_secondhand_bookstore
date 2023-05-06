package com.books.mapper;

import com.books.domain.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderInfoMapper {
    List<OrderInfo> selectOrderInfoList(OrderInfo orderInfo);

    OrderInfo selectOrderInfoByOrderId(Long orderId);

    int insertOrderInfo(OrderInfo orderInfo);

    int updateOrderInfo(OrderInfo orderInfo);

    int deleteOrderInfoByOrderId(Long orderId);

    int deleteOrderInfoByOrderIds(Long[] orderIds);
}
