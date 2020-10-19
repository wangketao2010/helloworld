package com.yc.jenkins.helper.mapper;

import com.yc.jenkins.helper.entity.po.BrandClueAdvertise;

public interface BrandClueAdvertiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BrandClueAdvertise record);

    int insertSelective(BrandClueAdvertise record);

    BrandClueAdvertise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BrandClueAdvertise record);

    int updateByPrimaryKey(BrandClueAdvertise record);
}