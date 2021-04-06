package com.my.service.impl;

import com.my.dao.BookDao;
import com.my.pojo.Books;
import com.my.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {


   private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Books> queryAllBook() {

        return bookDao.queryAllBook();
    }
}
