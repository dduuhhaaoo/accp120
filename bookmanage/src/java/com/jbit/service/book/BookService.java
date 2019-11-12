package com.jbit.service.book;

import com.jbit.pojo.User;

import java.util.List;

public interface BookService {
    List<User> getBookList();
    boolean DeleteBook(Integer id);
}
