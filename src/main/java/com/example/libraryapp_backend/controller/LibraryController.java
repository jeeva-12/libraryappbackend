package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController
{
    @PostMapping("/adminlogin")
    public String AdministatorLogin()
    {
        return "Administrator Login";
    }


    @PostMapping("/delete")
    public String Delete()
    {
        return "Delete Book";
    }


    @PostMapping("/edit")
    public String Edit()
    {
        return "Edit Book";
    }

    @PostMapping("/entry")
    public String Entry()
    {
        return "Book Entry";
    }


    @PostMapping("/issue")
    public String Issue()
    {
        return "Book Issue";
    }

    @PostMapping("/search")
    public String Search()
    {
        return "Search Book";
    }

    @GetMapping("/view")
    public String Viewall()
    {
        return "View all Books";
    }

    @PostMapping("/userlogin")
    public String Userlogin()
    {
        return "User Login";
    }




}
