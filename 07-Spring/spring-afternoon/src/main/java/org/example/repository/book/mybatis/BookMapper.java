package org.example.repository.book.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.domain.BookMybatis;

import java.util.List;

@Mapper // bean 등록
public interface BookMapper {
    public List<BookMybatis> findAll();
    public BookMybatis findById(@Param("id") Long id);
    public int save(BookMybatis newBook);
//  public int delete(@Param("id") Long id); 위 코드와 동일
    public int delete(Long id);



}
