package com.books.domain;

public class BookInfo extends Entity {
    /** 书籍ID */
    private int bookId;

    /** isbn号 */
    private String isbn;

    /** 书名 */
    private String bookName;

    /** 封面图路径 */
    private String bookCoverImg;

    /** 作者 */
    private String author;

    /** 译者 */
    private String translator;

    /** 描述 */
    private String bookDesc;

    /** 出版社 */
    private String publishing;

    /** 出版日期 */
    private String publishTime;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCoverImg() {
        return bookCoverImg;
    }

    public void setBookCoverImg(String bookCoverImg) {
        this.bookCoverImg = bookCoverImg;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookId=" + bookId +
                ", isbn='" + isbn + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookCoverImg='" + bookCoverImg + '\'' +
                ", author='" + author + '\'' +
                ", translator='" + translator + '\'' +
                ", bookDesc='" + bookDesc + '\'' +
                ", publishing='" + publishing + '\'' +
                ", publishTime='" + publishTime + '\'' +
                '}';
    }
}