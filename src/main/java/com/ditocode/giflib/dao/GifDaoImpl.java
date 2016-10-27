package com.ditocode.giflib.dao;

import com.ditocode.giflib.model.Gif;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by hector on 24/10/16.
 */
@Repository
public class GifDaoImpl implements GifDao{
    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<Gif> findAll() {
        Session session = sessionFactory.openSession();

        List<Gif> gifs = session.createCriteria(Gif.class).list();
        session.close();
        return gifs;
    }

    @Override
    public Gif findById(Long id) {
        Session session = sessionFactory.openSession();
        Gif gif = session.get(Gif.class, id);
        session.close();
        return gif;
    }

    @Override
    public void save(Gif gif) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(gif);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Gif gif) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(gif);
        session.getTransaction().commit();
        session.close();
    }
}
