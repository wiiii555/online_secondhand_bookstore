package com.books.domain;

public class PdInfo extends Entity{
    /** 商品id */
    private Long pdId;

    /** 卖家id */
    private Long ownerId;

    /** 书店id */
    private Long storeId;

    /** 书籍id */
    private Long bookId;

    /** 商品库存 */
    private int pdNum;

    /** 价格 */
    private Double price;

    /** 书籍信息 */
    private BookInfo bookInfo;

    public Long getPdId() {
        return pdId;
    }

    public void setPdId(Long pdId) {
        this.pdId = pdId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public int getPdNum() {
        return pdNum;
    }

    public void setPdNum(int pdNum) {
        this.pdNum = pdNum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }
}