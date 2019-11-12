package cn.book.service.book;


import cn.book.mapper.BookMapper;
import cn.book.pojo.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
//实现层
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> getBookList(int currentPageNo, int pageSize) {

        return  bookMapper.getBookList();
    }

    @Override
    public Integer bookye() {
        Integer bookye = bookMapper.bookye();
        return bookye;
    }

    @Override
    public Integer addlist(Book book) {
        return null;
    }


    @Override
    public int upda(Book book) {
        int upda = bookMapper.upda(book);
        return upda;
    }

    @Override
    public Book xiu(Integer id) {
        return null;
    }

    @Override
    public Integer dele(Integer id) {
        return null;
    }


}
