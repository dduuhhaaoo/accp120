package com.jbit.mapper;

import com.jbit.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookMapper {
    List<User> getBookList();
    boolean DeleteBook(@Param("id")Integer id);
}
