package com.books.controller;

import com.books.domain.PdInfo;
import com.books.service.impl.PdInfoServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pdinfo")
public class PdInfoController {
    @Autowired
    private PdInfoServiceImpl service;

    /**
     * 查询商品信息列表
     */
    @ApiOperation("查询商品信息列表")
    @GetMapping("/list")
    public List<PdInfo> list(PdInfo pdInfo)
    {
        List<PdInfo> list = service.selectPdInfoList(pdInfo);
        return list;
    }

    /**
     * 获取商品信息详细信息
     */
    @ApiOperation("获取商品信息详细信息")
    @GetMapping(value = "/{pdId}")
    public PdInfo getInfo(@PathVariable("pdId") Long pdId)
    {
        return service.selectPdInfoByPdId(pdId);
    }

    /**
     * 新增商品信息
     */
    @ApiOperation("新增商品信息")
    @PostMapping
    public int add(@RequestBody PdInfo pdInfo)
    {
        return service.insertPdInfo(pdInfo);
    }

    /**
     * 修改商品信息
     */
    @ApiOperation("修改商品信息")
    @PutMapping
    public int edit(@RequestBody PdInfo pdInfo)
    {
        return service.updatePdInfo(pdInfo);
    }

    /**
     * 删除商品信息
     */
    @ApiOperation("删除商品信息")
    @DeleteMapping("/{pdIds}")
    public int remove(@PathVariable Long[] pdIds)
    {
        return (service.deletePdInfoByPdIds(pdIds));
    }
}
