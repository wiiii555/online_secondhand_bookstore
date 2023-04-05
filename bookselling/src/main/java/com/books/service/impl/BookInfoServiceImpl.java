package com.books.service.impl;

import com.books.domain.BookInfo;
import com.books.mapper.BookInfoMapper;
import com.books.service.IBookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
    }

    /**
     * 新增书籍信息
     *
     * @param bookInfo 书籍信息
     * @return 结果
     */
    public int insertbookInfo(BookInfo bookInfo) {
        return 0;
    }

    /**
     * 修改书籍信息
     *
     * @param bookInfo 书籍信息
     * @return 结果
     */
    public int updatebookInfo(BookInfo bookInfo) {
        return 0;
    }

    /**
     * 批量删除书籍信息
     *
     * @param productIds 需要删除的书籍信息主键集合
     * @return 结果
     */
    public int deletebookInfoBybookIds(Long[] productIds) {
        return 0;
    }

    /**
     * 删除书籍信息信息
     *
     * @param productId 书籍信息主键
     * @return 结果
     */
    public int deletebookInfoBybookId(Long productId) {
        return 0;
    }

}
