package com.eass.service;

import com.eass.model.Content;
import com.eass.model.Member;

import java.util.List;

/**
 * Created by Administrator on 2016/11/10.
 */
public interface UserService {
    public List<String> getAllUsers();
    public void saveMembers(List<Member> m);
    public void SaveContent(List<Content> c);
    public List<Content> getAllContent();
    public void delete(int id);
    public List<Content> getOne(Integer id);
    public void update(int id, String title, String content);

}
