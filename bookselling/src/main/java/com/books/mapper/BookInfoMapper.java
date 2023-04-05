package com.books.mapper;

import java.util.List;
import com.books.domain.BookInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookInfoMapper {
    List<BookInfo> selectBookInfoList(BookInfo book);
    BookInfo selectBookInfoByBookId(Long bookId);
    int insertBookInfo(BookInfo book);
    int updateBookInfo(BookInfo book);
    int deletePdInfoByBookId(Long bookId);
    int deletePdInfoByBookIds(Long[] bookIds);
}