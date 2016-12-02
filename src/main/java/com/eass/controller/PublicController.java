package com.eass.controller;

import com.eass.model.Content;
import com.eass.model.Member;
import com.eass.model.User;
import com.eass.service.UserService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class PublicController {
    @Autowired
    private UserService userService;

    public String doHandle(){
        List<Content> objects = new ArrayList<Content>();
        Content content = new Content();


        return "redirect:index";
    }


    public void main(String[] args){


        //this.doIts();

        System.out.println("sharp");
    }
    public void doIts(String ids){
        System.out.println(ids);
    }
    private String doIt(String ids){
         return ids;
    }
}
