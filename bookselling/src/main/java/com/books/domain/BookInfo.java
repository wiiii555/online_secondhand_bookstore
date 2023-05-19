package com.books.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * book_info
 * @author wrs
 */
public class BookInfo extends Entity {
    /** 书籍id */
    private Long bookId;

    /** 标准书号 */
    private String isbn;

    /** 书名 */
    private String bookName;

    /** 封面 */
    private String bookCoverImg;

    /** 作者 */
    private String author;

    /** 简介 */
    private String bookDesc;

    /** 是否为译本:1表示译本 */
    private Boolean ifTranslation;

    /** 原书标题 */
    private String initialTitle;

    /** 原书语言 */
    private Integer initialLang;

    /** 译者 */
    private String translator;

    /** 语言 */
    private Integer lang;

    /** 出版社 */
    private String publishing;

    /** 出版时间 */
    private String publishTime;

    private static final long serialVersionUID = 1L;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
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

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public Boolean getIfTranslation() {
        return ifTranslation;
    }

    public void setIfTranslation(Boolean ifTranslation) {
        this.ifTranslation = ifTranslation;
    }

    public String getInitialTitle() {
        return initialTitle;
    }

    public void setInitialTitle(String initialTitle) {
        this.initialTitle = initialTitle;
    }

    public Integer getInitialLang() {
        return initialLang;
    }

    public void setInitialLang(Integer initialLang) {
        this.initialLang = initialLang;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public Integer getLang() {
        return lang;
    }

    public void setLang(Integer lang) {
        this.lang = lang;
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
                ", bookDesc='" + bookDesc + '\'' +
                ", ifTranslation=" + ifTranslation +
                ", initialTitle='" + initialTitle + '\'' +
                ", initialLang=" + initialLang +
                ", translator='" + translator + '\'' +
                ", lang=" + lang +
                ", publishing='" + publishing + '\'' +
                ", publishTime='" + publishTime + '\'' +
                '}';
    }
}