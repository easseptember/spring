package com.eass.controller;

import com.eass.model.Content;
import com.eass.model.Member;
import com.eass.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HandleController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/doHandler", method = RequestMethod.POST)
    public String doHandler(
            String title,
            String content,
            String uname
    ) throws Exception{
        try {
            List<Content> contents = new ArrayList<Content>();
            Content content1 = new Content();
            long time = System.currentTimeMillis();
            content1.setTitle(title);
            content1.setContent(content);
            content1.setUname(uname);
            content1.setAddtime(time+"");
            contents.add(content1);
            userService.SaveContent(contents);
            System.out.println(title);
            System.out.println(content);


        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/home";
    }
    @RequestMapping(value = "/doUpdate", method = RequestMethod.POST)
    public String doUpdate(
            String title,
            String content,
            int id
    ) throws Exception{
        try {

            userService.update(id, title, content);



        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/home";
    }
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id){
        userService.delete(id);
        return "redirect:/home";
    }
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(Integer id, HttpServletRequest request){
        List<Content> info = userService.getOne(id);
        request.setAttribute("info", info);
        System.out.println(info);
        return "update";
    }
}
