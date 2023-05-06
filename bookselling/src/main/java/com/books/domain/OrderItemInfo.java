package com.books.domain;

public class OrderItemInfo extends Entity{
    /** 订单项id */
    private Long itemId;

    /** 订单id */
    private Long orderId;

    /** 商品id */
    private Long pdId;

    /** 商品数量 */
    private int itemNum;

    /** 商品单价 */
    private Double itemPrice;

    public Long getOrderItemId() {
        return itemId;
    }

    public void setOrderItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getPdId() {
        return pdId;
    }

    public void setPdId(Long pdId) {
        this.pdId = pdId;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
