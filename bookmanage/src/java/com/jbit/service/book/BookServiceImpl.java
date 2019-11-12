package com.jbit.service.book;

import com.jbit.mapper.BookMapper;
import com.jbit.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public List<User> getBookList() {
    List<User> user = bookMapper.getBookList();
        return user;
    }

    @Override
    public boolean DeleteBook(Integer id) {
        boolean fage = bookMapper.DeleteBook(id);
        return fage;
    }
}
