package com.books.controller;

import com.books.domain.BookInfo;
import io.swagger.annotations.ApiOperation;
import com.books.service.impl.BookInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookinfo")
public class BookInfoController {
    @Autowired
    private BookInfoServiceImpl service;

    /**
     * 查询书籍信息列表
     */
    @ApiOperation("查询书籍信息列表")
    @GetMapping("/list")
    public List<BookInfo> list(BookInfo bookInfo)
    {
        List<BookInfo> list = service.selectBookInfoList(bookInfo);
        return list;
    }

    /**
     * 获取书籍信息详细信息
     */
    @ApiOperation("获取书籍信息详细信息")
    @GetMapping(value = "/{bookId}")
    public BookInfo getInfo(@PathVariable("bookId") Long bookId)
    {
        return service.selectBookInfoByBookId(bookId);
    }

    /**
     * 新增书籍信息
     */
    @ApiOperation("新增书籍信息")
    @PostMapping
    public int add(@RequestBody BookInfo bookInfo)
    {
        return service.insertBookInfo(bookInfo);
    }

    /**
     * 修改书籍信息
     */
    @ApiOperation("修改书籍信息")
    @PutMapping
    public int edit(@RequestBody BookInfo bookInfo)
    {
        return service.updateBookInfo(bookInfo);
    }

    /**
     * 删除书籍信息
     */
    @ApiOperation("删除书籍信息")
    @DeleteMapping("/{bookIds}")
    public int remove(@PathVariable Long[] bookIds)
    {
        return (service.deleteBookInfoByBookIds(bookIds));
    }
}
