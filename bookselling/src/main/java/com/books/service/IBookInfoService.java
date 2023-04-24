package com.books.service;

import com.books.domain.BookInfo;

import java.util.List;

public interface IBookInfoService {

    /**
     * 查询书籍信息
     *
     * @param bookId 书籍信息主键
     * @return 书籍信息
     */
    public BookInfo selectBookInfoByBookId(Long bookId);

    /**
     * 查询书籍信息列表
     *
     * @param bookInfo 书籍信息
     * @return 书籍信息集合
     */
    public List<BookInfo> selectBookInfoList(BookInfo bookInfo);

    /**
     * 新增书籍信息
     *
     * @param bookInfo 书籍信息
     * @return 结果
     */
    public int insertBookInfo(BookInfo bookInfo);

    /**
     * 修改书籍信息
     *
     * @param bookInfo 书籍信息
     * @return 结果
     */
    public int updateBookInfo(BookInfo bookInfo);

    /**
     * 批量删除书籍信息
     *
     * @param bookIds 需要删除的书籍信息主键集合
     * @return 结果
     */
    public int deleteBookInfoByBookIds(Long[] bookIds);

    /**
     * 删除书籍信息信息
     *
     * @param bookId 书籍信息主键
     * @return 结果
     */
    public int deleteBookInfoByBookId(Long bookId);
}
