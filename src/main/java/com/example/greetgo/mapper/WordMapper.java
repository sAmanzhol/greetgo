package com.example.greetgo.mapper;

import com.example.greetgo.domain.Word;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WordMapper {
     @Select("SELECT * FROM WORD WHERE id=#{id}")
     Word findWordById(int id);
}
