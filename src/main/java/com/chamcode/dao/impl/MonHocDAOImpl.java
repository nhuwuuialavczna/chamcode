package com.chamcode.dao.impl;

import com.chamcode.dao.MonHocDAO;
import com.chamcode.model.Monhoc;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class MonHocDAOImpl implements MonHocDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Monhoc> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Monhoc");
        return query.list();
    }

    @Override
    public boolean add(Monhoc monhoc) {
        Session session = sessionFactory.getCurrentSession();
        return session.save(monhoc) != null;
    }

    @Override
    public Monhoc getMonhoc(String id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Monhoc.class, id);
    }
}
