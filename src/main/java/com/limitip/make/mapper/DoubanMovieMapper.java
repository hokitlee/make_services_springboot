package com.limitip.make.mapper;

import com.limitip.make.pojo.DoubanMovie;
import com.limitip.make.pojo.DoubanMovieExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DoubanMovieMapper {
    long countByExample(DoubanMovieExample example);

    int deleteByExample(DoubanMovieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoubanMovie record);

    int insertSelective(DoubanMovie record);

    List<DoubanMovie> selectByExample(DoubanMovieExample example);

    DoubanMovie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoubanMovie record, @Param("example") DoubanMovieExample example);

    int updateByExample(@Param("record") DoubanMovie record, @Param("example") DoubanMovieExample example);

    int updateByPrimaryKeySelective(DoubanMovie record);

    int updateByPrimaryKey(DoubanMovie record);
}