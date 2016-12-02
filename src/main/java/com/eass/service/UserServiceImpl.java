package com.eass.service;

import com.eass.DAO.MemberDAO;
import com.eass.model.Content;
import com.eass.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private MemberDAO memberDAO;
    public List<String> getAllUsers(){


        HashMap<String,String> stringHashMap = new HashMap<String,String>();
        List<String> stringListArray = new ArrayList<String>();
        for (int i=0;i<=4;i++){
            stringListArray.add("name"+i);
        }
        return stringListArray;
    }

    public void saveMembers(List<Member> m) {
        for(Member ms:m){
            memberDAO.save(ms);
        }
    }

    public void SaveContent(List<Content> c) {
        for(Content ct:c){
            memberDAO.save(ct);
        }
    }

    public List<Content> getAllContent() {

        return memberDAO.getAllContent();
    }

    public void delete(int id) {
        memberDAO.delete(id);
    }

    public List<Content> getOne(Integer id) {
        List<Content> one = memberDAO.getOne(id);
        return one;
    }

    public void update(int id, String title, String content) {
        memberDAO.update(id, title, content);
    }


}
