package com.mybatis.demo.mapper;

import com.mybatis.demo.models.pojo.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TodoMapper {

    Todo getTodo(@Param("id") int id);
}
