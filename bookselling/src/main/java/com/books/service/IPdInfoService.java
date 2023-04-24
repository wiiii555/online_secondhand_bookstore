package com.books.service;

import com.books.domain.PdInfo;

import java.util.List;

public interface IPdInfoService {
    /**
     * 查询商品信息
     *
     * @param pdId 商品信息主键
     * @return 商品信息
     */
    public PdInfo selectPdInfoByPdId(Long pdId);

    /**
     * 查询商品信息列表
     *
     * @param pdInfo 商品信息
     * @return 商品信息集合
     */
    public List<PdInfo> selectPdInfoList(PdInfo pdInfo);

    /**
     * 新增商品信息
     *
     * @param pdInfo 商品信息
     * @return 结果
     */
    public int insertPdInfo(PdInfo pdInfo);

    /**
     * 修改商品信息
     *
     * @param pdInfo 商品信息
     * @return 结果
     */
    public int updatePdInfo(PdInfo pdInfo);

    /**
     * 批量删除商品信息
     *
     * @param pdIds 需要删除的商品信息主键集合
     * @return 结果
     */
    public int deletePdInfoByPdIds(Long[] pdIds);

    /**
     * 删除商品信息信息
     *
     * @param pdId 商品信息主键
     * @return 结果
     */
    public int deletePdInfoByPdId(Long pdId);
}
