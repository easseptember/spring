package com.eass.DAO;


import com.eass.model.Content;
import com.eass.model.Member;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberDAOImpl implements MemberDAO {
    @Autowired
    private SessionFactory sessionFactory;
    public int save(Member m){

            Transaction transaction = sessionFactory.getCurrentSession().beginTransaction();
            Integer save = (Integer) sessionFactory.getCurrentSession().save(m);
            transaction.commit();



            /*
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(...);
        tx.commit();
        session.close();
        */

return save;
    }

    public int save(Content c) {
        Transaction transaction = sessionFactory.getCurrentSession().beginTransaction();
        Integer save = (Integer) sessionFactory.getCurrentSession().save(c);
        transaction.commit();
        return save;
    }

    public List<Content> getAllContent() {
        //ASTQueryTranslatorFactory

        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = sessionFactory.getCurrentSession().beginTransaction();
        //session.beginTransaction();
        String hql = "from com.eass.model.Content";
        Query query = session.createQuery(hql);

        List<Content> list = query.list();
        return list;
        //transaction.commit();


    }

    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = sessionFactory.getCurrentSession().beginTransaction();
        //session.beginTransaction();
        String hql = "delete Content as c  where c.id=?";
        Query query = session.createQuery(hql);

        query.setInteger(0, id);
        query.executeUpdate();
        transaction.commit();
    }



    public List<Content> getOne(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = sessionFactory.getCurrentSession().beginTransaction();
        //session.beginTransaction();
        String hql = "from Content as c where c.id=?";
        Query query = session.createQuery(hql);
        query.setInteger(0, id);
        List<Content> list = query.list();
        return list;
    }

    public void update(int id, String title, String content) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = sessionFactory.getCurrentSession().beginTransaction();
        //session.beginTransaction();
        String hql = "update Content c set c.title=?,c.content=? where c.id=?";
        Query query = session.createQuery(hql);
        query.setString(0, title);
        query.setString(1, content);
        query.setInteger(2, id);
        query.executeUpdate();
        transaction.commit();
    }


}
