package com.yc.jenkins.helper.mapper;

import com.yc.jenkins.helper.entity.po.JenkinsConfig;
import org.apache.ibatis.annotations.Param;

public interface JenkinsConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JenkinsConfig record);

    int insertSelective(JenkinsConfig record);

    JenkinsConfig selectByPrimaryKey(Integer id);

    JenkinsConfig selectByJarAndEnv(@Param("jarName") String jarName,@Param("env") String env);

    int updateByPrimaryKeySelective(JenkinsConfig record);

    int updateByPrimaryKey(JenkinsConfig record);
}