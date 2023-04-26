package com.books.mapper;

import com.books.domain.CartInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartInfoMapper {
    List<CartInfo> selectCartInfoList(CartInfo cart);

    CartInfo selectCartInfoByCartId(Long cartId);

    int insertCartInfo(CartInfo cart);

    int updatePdCartNum(CartInfo cart);

    int deleteCartInfoByCartId(Long cartId);

    int deleteCartInfoByCartIds(Long[] cartIds);
}
