package com.books.mapper;

import java.util.List;
import com.books.domain.BookInfo;

public interface BookInfoMapper {
    BookInfo selectBookInfoList();
    BookInfo selectBookInfoByBookId(Long id);
}