package com.books.service.impl;

import com.books.domain.BookInfo;
import com.books.mapper.BookInfoMapper;
import com.books.service.IBookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BookInfoServiceImpl implements IBookInfoService {
    @Autowired
    private BookInfoMapper mapper;

    /**
     * 查询书籍信息
     *
     * @param bookId 书籍信息主键
     * @return 书籍信息
     */
    @Override
    public BookInfo selectBookInfoByBookId(Long bookId) {
        return mapper.selectBookInfoByBookId(bookId);
    }

    /**
     * 查询书籍信息列表
     *
     * @param bookInfo 书籍信息
     * @return 书籍信息集合
     */
    public List<BookInfo> selectBookInfoList(BookInfo bookInfo) {
        return mapper.selectBookInfoList(bookInfo);
    }

    /**
     * 新增书籍信息
     *
     * @param bookInfo 书籍信息
     * @return 结果
     */
    public int insertBookInfo(BookInfo bookInfo) {
        bookInfo.setCreateBy("wiiii");
        bookInfo.setCreateTime(new Date());
        return mapper.insertBookInfo(bookInfo);
    }

    /**
     * 修改书籍信息
     *
     * @param bookInfo 书籍信息
     * @return 结果
     */
    public int updateBookInfo(BookInfo bookInfo) {
        bookInfo.setUpdateBy("wiiii");
        bookInfo.setUpdateTime(new Date());
        return mapper.updateBookInfo(bookInfo);
    }

    /**
     * 批量删除书籍信息
     *
     * @param bookIds 需要删除的书籍信息主键集合
     * @return 结果
     */
    public int deleteBookInfoByBookIds(Long[] bookIds) {
        return mapper.deleteBookInfoByBookIds(bookIds);
    }

    /**
     * 删除书籍信息信息
     *
     * @param bookId 书籍信息主键
     * @return 结果
     */
    public int deleteBookInfoByBookId(Long bookId) {
        return mapper.deleteBookInfoByBookId(bookId);
    }

}
