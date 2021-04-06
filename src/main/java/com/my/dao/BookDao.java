package com.my.dao;

import com.my.pojo.Books;

import java.util.List;

public interface BookDao {
    /*查询全部图书*/
    List<Books> queryAllBook();
}
