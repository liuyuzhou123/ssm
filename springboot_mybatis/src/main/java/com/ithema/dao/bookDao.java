package com.ithema.dao;

import com.ithema.domain.book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface bookDao {
    @Select("select * from tbl_book where id=#{id}")
    public book getById(Integer id);
}
