package com.eass.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contents")
public class Content implements Serializable {

    private int id;
    private String title;
    private String content;
    private String uname;
    private String addtime;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUname() {
        return uname;
    }

    public String getAddtime() {
        return addtime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
