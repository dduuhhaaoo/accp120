package cn.book.mapper;


import cn.book.pojo.Book;
import cn.book.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookMapper {
//新增
    Integer addlist(Book book);
//查询
    List<Book> getBookList();

    Integer bookye();
//修改
    public int upda(Book book);
//删除
    boolean DeleteBook(@Param("id") Integer id);
}
