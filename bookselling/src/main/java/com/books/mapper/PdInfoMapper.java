package com.books.mapper;

import com.books.domain.PdInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PdInfoMapper {

    List<PdInfo> selectPdInfoList(PdInfo pd);

    PdInfo selectPdInfoByPdId(Long pdId);

    int insertPdInfo(PdInfo pd);

    int updatePdInfo(PdInfo pd);

    int deletePdInfoByPdId(Long pdId);

    int deletePdInfoByPdIds(Long[] pdIds);
}
