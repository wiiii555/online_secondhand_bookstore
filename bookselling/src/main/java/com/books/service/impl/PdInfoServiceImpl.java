package com.books.service.impl;

import com.books.domain.PdInfo;
import com.books.mapper.PdInfoMapper;
import com.books.service.IPdInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PdInfoServiceImpl implements IPdInfoService {
    @Autowired
    private PdInfoMapper mapper;

    /**
     * 查询商品信息
     *
     * @param pdId 商品信息主键
     * @return 商品信息
     */
    @Override
    public PdInfo selectPdInfoByPdId(Long pdId) {
        return mapper.selectPdInfoByPdId(pdId);
    }

    /**
     * 查询商品信息列表
     *
     * @param pdInfo 商品信息
     * @return 商品信息集合
     */
    public List<PdInfo> selectPdInfoList(PdInfo pdInfo) {
        return mapper.selectPdInfoList(pdInfo);
    }

    /**
     * 新增商品信息
     *
     * @param pdInfo 商品信息
     * @return 结果
     */
    public int insertPdInfo(PdInfo pdInfo) {
        pdInfo.setCreateBy("wiiii");
        pdInfo.setCreateTime(new Date());
        return mapper.insertPdInfo(pdInfo);
    }

    /**
     * 修改商品信息
     *
     * @param pdInfo 商品信息
     * @return 结果
     */
    public int updatePdInfo(PdInfo pdInfo) {
        pdInfo.setUpdateBy("wiiii");
        pdInfo.setUpdateTime(new Date());
        return mapper.updatePdInfo(pdInfo);
    }

    /**
     * 批量删除商品信息
     *
     * @param pdIds 需要删除的商品信息主键集合
     * @return 结果
     */
    public int deletePdInfoByPdIds(Long[] pdIds) {
        return mapper.deletePdInfoByPdIds(pdIds);
    }

    /**
     * 删除商品信息信息
     *
     * @param pdId 商品信息主键
     * @return 结果
     */
    public int deletePdInfoByPdId(Long pdId) {
        return mapper.deletePdInfoByPdId(pdId);
    }
}
