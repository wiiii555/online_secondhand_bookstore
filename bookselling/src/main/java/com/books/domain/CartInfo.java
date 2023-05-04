package com.books.domain;

public class CartInfo extends Entity{
    /** 购物车id */
    private Long cartId;

    /** 商品id */
    private Long pdId;

    /** 用户账号 */
    private Long userId;

    /** 商品在购物车中的数量 */
    private int pdCartNum;

    /** 商品信息 */
    private PdInfo pdInfo;

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getPdId() {
        return pdId;
    }

    public void setPdId(Long pdId) {
        this.pdId = pdId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getPdCartNum() {
        return pdCartNum;
    }

    public void setPdCartNum(int pdCartNum) {
        this.pdCartNum = pdCartNum;
    }

    public PdInfo getPdInfo() {
        return pdInfo;
    }

    public void setPdInfo(PdInfo pdInfo) {
        this.pdInfo = pdInfo;
    }
}
