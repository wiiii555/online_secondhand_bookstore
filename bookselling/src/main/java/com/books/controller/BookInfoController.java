package com.books.controller;

import com.books.service.impl.BookInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookInfoController {
    @Autowired
    private BookInfoServiceImpl service;

//    /**
//     * 查询商品信息列表
//     */
//    @ApiOperation("查询商品信息列表")
////    @RequiresPermissions("applet:info:list")
//    @GetMapping("/list")
//    public TableDataInfo list(BookInfo bookInfo)
//    {
//        startPage();
//        List<BookInfo> list = bookInfoService.selectBookInfoList(bookInfo);
//        return getDataTable(list);
//    }

    @GetMapping("/test")
    public String test(Model model) {
        String info = service.selectBookInfoByBookId(1L).toString();
        model.addAttribute("bookInfo", info);
        return "test";
    }
}
