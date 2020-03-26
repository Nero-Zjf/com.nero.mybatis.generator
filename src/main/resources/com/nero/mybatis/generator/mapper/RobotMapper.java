package com.nero.mybatis.generator.mapper;

import com.nero.mybatis.generator.entity.Robot;

public interface RobotMapper {
    int deleteByPrimaryKey(Long robotId);

    int insert(Robot record);

    int insertSelective(Robot record);

    Robot selectByPrimaryKey(Long robotId);

    int updateByPrimaryKeySelective(Robot record);

    int updateByPrimaryKey(Robot record);
}