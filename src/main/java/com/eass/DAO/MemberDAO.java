package com.eass.DAO;


import com.eass.model.Content;
import com.eass.model.Member;

import java.util.List;

public interface MemberDAO {

    public int save(Member m);
    public int save(Content c);
    public List<Content> getAllContent();
    public void delete(int id);
    public List<Content> getOne(Integer id);
    public void update(int id, String title, String content);


}
