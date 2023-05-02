package com.books.service.impl;

import com.books.domain.CartInfo;
import com.books.mapper.CartInfoMapper;
import com.books.service.ICartInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CartInfoServiceImpl implements ICartInfoService {
    @Autowired
    private CartInfoMapper mapper;

    /**
     * 查询购物车信息
     *
     * @param cartId 购物车信息主键
     * @return 购物车信息
     */
    @Override
    public CartInfo selectCartInfoByCartId(Long cartId) {
        return mapper.selectCartInfoByCartId(cartId);
    }

    /**
     * 查询购物车信息列表
     *
     * @param  cartInfo 购物车信息
     * @return 购物车信息集合
     */
    public List<CartInfo> selectCartInfoList(CartInfo cartInfo) {
        return mapper.selectCartInfoList(cartInfo);
    }

    /**
     * 新增购物车信息
     *
     * @param cartInfo 购物车信息
     * @return 结果
     */
    public int insertCartInfo(CartInfo cartInfo) {
        cartInfo.setCreateBy("wiiii");
        cartInfo.setCreateTime(new Date());
        return mapper.insertCartInfo(cartInfo);
    }

    /**
     * 修改购物车信息
     *
     * @param cartInfo 购物车信息
     * @return 结果
     */
    public int updatePdCartNum(CartInfo cartInfo) {
        cartInfo.setUpdateBy("wiiii");
        cartInfo.setUpdateTime(new Date());
        return mapper.updatePdCartNum(cartInfo);
    }

    /**
     * 批量删除购物车信息
     *
     * @param cartIds 需要删除的购物车信息主键集合
     * @return 结果
     */
    public int deleteCartInfoByCartIds(Long[] cartIds) {
        return mapper.deleteCartInfoByCartIds(cartIds);
    }

    /**
     * 删除购物车信息
     *
     * @param cartId 购物车信息主键
     * @return 结果
     */
    public int deleteCartInfoByCartId(Long cartId) {
        return mapper.deleteCartInfoByCartId(cartId);
    }

    /**
     * 校验商品在购物车中是否已存在
     *
     * @param cartInfo 购物车
     * @return 存在则返回该购物车条目，否则返回null
     */
    public CartInfo checkIsPdExist(CartInfo cartInfo) {
        List<CartInfo> list = mapper.selectCartInfoList(cartInfo);
        if (list.size() > 0)
            return list.get(0);
        else
            return null;
    }
}
