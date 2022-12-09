package com.example.libraryapp_backend.controller;

import com.example.libraryapp_backend.dao.BookDao;
import com.example.libraryapp_backend.dao.UserresgDao;
import com.example.libraryapp_backend.model.Books;
import com.example.libraryapp_backend.model.Userresg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class LibraryController
{
    @Autowired
    private BookDao dao;
    private UserresgDao doa;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addbook", consumes = "application/json", produces = "application/json")
    public String addbook(@RequestBody Books b){
        System.out.println(b.getTitle().toString());
        dao.save(b);
        return "Book added Successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewbook")
    public List<Books> viewbook(){
        return (List<Books>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/searchbook", consumes = "application/json", produces = "application/json")
    public List<Books> searchbook(@RequestBody Books b){
        String title = String.valueOf(b.getTitle()) ;
        System.out.println(title);
        return (List<Books>) dao.SearchBook(b.getTitle());

    }


    @CrossOrigin
    @PostMapping(path= "/deletebook", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> deletebook(@RequestBody Books b){
        String bookid=String.valueOf(b.getId());
        System.out.println(bookid);
        dao.DeleteBook(b.getId());
        HashMap<String ,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser", consumes = "application/json", produces = "application/json")
    public String adduser(@RequestBody Userresg u){
        System.out.println(u.getUsername().toString());
        doa.save(u);
        return "User added Successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewuser")
    public List<Userresg> viewuser(){
        return (List<Userresg>) doa.findAll();
    }

    @CrossOrigin
    @PostMapping(path= "/deleteuser", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> deleteuser(@RequestBody Userresg u){
        String userid=String.valueOf(u.getId());
        System.out.println(userid);
        doa.DeleteUser(u.getId());
        HashMap<String ,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }








}
