package com.nero.mybatis.generator.mapper;

import com.nero.mybatis.generator.entity.Task;

public interface TaskMapper {
    int deleteByPrimaryKey(Long taskId);

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(Long taskId);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}