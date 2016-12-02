package com.eass.controller;

import com.eass.model.Content;
import com.eass.model.Member;
import com.eass.service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class WebController {
    private SessionFactory sessionFactory;
    @Autowired
    private UserService userService;
    @RequestMapping("/home")
    public String home(HttpServletRequest request){
        List<Content> list = userService.getAllContent();
        request.setAttribute("list", list);
        return "index";
    }

    @RequestMapping("/")
    public String index(HttpServletRequest request){
        List<Content> list = userService.getAllContent();
        request.setAttribute("list", list);
        return "index";
    }
    @RequestMapping(value = "/add")
    public String add(){
        return "add";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<String> info(){
        /*
        Map<String, String> stringStringHashMap = new HashMap<String, String>();

        stringStringHashMap.put("name", "eass");
        stringStringHashMap.put("password", "123456");
        stringStringHashMap.put("email", "15522280@qq.com");
        */
        return userService.getAllUsers();
    }
    @RequestMapping("/save")
    public String save(){
        List<Member> listMember = new ArrayList<Member>();
        Member member = new Member();
        member.setUsername("wangzhiqiang");
        member.setPassword("123456");
        member.setEmail("15522280@qq.com");
        member.setRemark("wu");
        listMember.add(member);
        userService.saveMembers(listMember);
        System.out.println(member);
        return "save";


    }
    @RequestMapping("/map")
    public void map(){
/*
        Date date = new Date();
        Timestamp nousedate = new Timestamp( date.getTime());
        System.out.println(time);
        */
        long s = System.currentTimeMillis() / 1000;
        System.out.println(s);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        System.out.println(simpleDateFormat.format(date));
/*
        SimpleDateFormat format =  newSimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long time=newLong(445555555);
        String d = format.format(time);
        Date date=format.parse(d);
        System.out.println("Format To String(Date):"+d);
        System.out.println("Format To Date:"+date);
        */

    }




}
