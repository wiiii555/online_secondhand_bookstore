package com.books.mapper;

import com.books.domain.BookInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookInfoMapper {
    List<BookInfo> selectBookInfoList(BookInfo book);

    BookInfo selectBookInfoByBookId(Long bookId);

    int insertBookInfo(BookInfo book);

    int updateBookInfo(BookInfo book);

    int deleteBookInfoByBookId(Long bookId);

    int deleteBookInfoByBookIds(Long[] bookIds);
}