package com.my;

import com.my.pojo.Books;
import com.my.service.impl.BookServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class Test1 {

    @Test
    public void m1(){
        System.out.println("hello,Git");
        
        System.out.println("hello");
    }

    @Test
    public void m3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BookServiceImpl service =(BookServiceImpl) context.getBean("bookService");
        List<Books> books = service.queryAllBook();
        System.out.println(books.size());
    }
}
