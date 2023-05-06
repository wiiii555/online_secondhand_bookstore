package com.books.mapper;

import com.books.domain.OrderItemInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemInfoMapper {
    List<OrderItemInfo> selectOrderItemInfoList(OrderItemInfo orderItemInfo);

    OrderItemInfo selectOrderItemInfoByItemId(Long itemId);

    int insertOrderItemInfo(OrderItemInfo orderItemInfo);

    int updateOrderItemInfo(OrderItemInfo orderItemInfo);

    int deleteOrderItemInfoByItemId(Long itemId);

    int deleteOrderItemInfoByItemIds(Long[] itemIds);
}
