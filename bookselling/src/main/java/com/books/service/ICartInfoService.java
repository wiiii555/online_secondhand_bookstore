package com.books.service;

import com.books.domain.CartInfo;

import java.util.List;

public interface ICartInfoService {
    /**
     * 查询购物车信息
     *
     * @param cartId 购物车信息主键
     * @return 购物车信息
     */
    public CartInfo selectCartInfoByCartId(Long cartId);

    /**
     * 查询购物车信息列表
     *
     * @param cartInfo 购物车信息
     * @return 购物车信息集合
     */
    public List<CartInfo> selectCartInfoList(CartInfo cartInfo);

    /**
     * 新增购物车信息
     *
     * @param cartInfo 购物车信息
     * @return 结果
     */
    public int insertCartInfo(CartInfo cartInfo);

    /**
     * 修改购物车信息
     *
     * @param cartInfo 购物车信息
     * @return 结果
     */
    public int updatePdCartNum(CartInfo cartInfo);

    /**
     * 批量删除购物车信息
     *
     * @param cartIds 需要删除的购物车信息主键集合
     * @return 结果
     */
    public int deleteCartInfoByCartIds(Long[] cartIds);

    /**
     * 删除购物车信息信息
     *
     * @param cartId 购物车信息主键
     * @return 结果
     */
    public int deleteCartInfoByCartId(Long cartId);
}
