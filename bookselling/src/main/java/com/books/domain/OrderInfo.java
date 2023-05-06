package com.books.domain;

import java.util.List;

public class OrderInfo extends Entity{
    /** 订单id */
    private Long orderId;

    /** 订单编号 */
    private String orderCode;

    /** 买家id */
    private Long orderBuyerId;

    /** 卖家id */
    private Long orderSellerId;

    /** 订单状态 */
    private int orderStatus;

    /** 商品总量 */
    private int totalCount;

    /** 商品总价 */
    private Double totalPrice;

    /** 收货地址 */
    private String receiverAddr;

    /** 收货人信息 */
    private String receiverInfo;

    /** 订单项信息 */
    private List<OrderItemInfo> orderItemList;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Long getOrderBuyerId() {
        return orderBuyerId;
    }

    public void setOrderBuyerId(Long orderBuyerId) {
        this.orderBuyerId = orderBuyerId;
    }

    public Long getOrderSellerId() {
        return orderSellerId;
    }

    public void setOrderSellerId(Long orderSellerId) {
        this.orderSellerId = orderSellerId;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getReceiverAddr() {
        return receiverAddr;
    }

    public void setReceiverAddr(String receiverAddr) {
        this.receiverAddr = receiverAddr;
    }

    public String getReceiverInfo() {
        return receiverInfo;
    }

    public void setReceiverInfo(String receiverInfo) {
        this.receiverInfo = receiverInfo;
    }
}
