package com.my.controller;

import com.my.pojo.Books;
import com.my.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller调用service

    @Autowired
    private BookService bookService;
    @RequestMapping("/m1")
    public String m1(Model model){
        List<Books> books = bookService.queryAllBook();
        System.out.println(books.size());
        model.addAttribute("msg",books.size());
        return "hello";
    }
}
