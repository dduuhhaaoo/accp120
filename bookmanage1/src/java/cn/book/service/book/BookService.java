package cn.book.service.book;


import cn.book.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//业务逻辑层
public interface BookService {

    List<Book> getBookList(int currentPageNo, int pageSize);

    Integer bookye();

    Integer addlist(Book book);

    public int upda(Book book);

    Book xiu(@Param("id") Integer id);

    Integer dele(@Param("id") Integer id);

}
